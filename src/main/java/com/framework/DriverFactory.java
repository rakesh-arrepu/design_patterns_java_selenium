package com.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
//    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static WebDriver driver;
    private static Properties properties = null;

    private static void loadProperties() {
        if (properties == null) {
            properties = new Properties();
            try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException("Could not load config.properties", e);
            }
        }
    }

    protected DriverFactory() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = initDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
//            driver.remove();
        }
    }

    private static WebDriver initDriver() {
        loadProperties();
        String browser = properties.getProperty("browser", "chrome").toLowerCase();
        boolean headless = Boolean.parseBoolean(properties.getProperty("headless", "false"));

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless) chromeOptions.addArguments("--headless=new");
                chromeOptions.addArguments("--disable-gpu", "--window-size=1920,1080");
                return new ChromeDriver(chromeOptions);
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (headless) firefoxOptions.addArguments("-headless");
                return new FirefoxDriver(firefoxOptions);
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                if (headless) edgeOptions.addArguments("--headless=new");
                return new EdgeDriver(edgeOptions);
            case "safari":
                // SafariDriver comes bundled, does not support headless
                return new SafariDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    public static Properties getConfig() {
        loadProperties();
        return properties;
    }
}
