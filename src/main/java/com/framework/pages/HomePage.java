package com.framework.pages;

import com.framework.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends DriverFactory {
    private WebDriver driver;
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");

    public HomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://www.google.com");
    }

    public void search(String query) {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchButton).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
