package com.tests;

import com.framework.DriverFactory;
import com.framework.pages.HomePage;
import com.framework.utils.LoggerUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;

public class HomePageTest {
    private WebDriver driver;
    private Logger logger = LoggerUtil.getLogger(HomePageTest.class);

    @BeforeMethod
    public void setUp() {
        logger.info("Setting up browser");
        driver = DriverFactory.getDriver();
    }

    @Test
    public void verifyGoogleHomePageTitle() {
        logger.info("Navigating to Google Home Page");
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        String title = homePage.getTitle();
        logger.info("Page title is: " + title);
        Assert.assertTrue(title.contains("Google"), "Title should contain 'Google'");
    }

    @AfterMethod
    public void tearDown() {
        logger.info("Tearing down browser");
        DriverFactory.quitDriver();
    }
}
