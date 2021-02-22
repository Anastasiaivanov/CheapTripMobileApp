package com.telran.cheaptrip.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    AppiumDriver<WebElement> driver;
    DesiredCapabilities caps;

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startTest(){
        logger.info("Start Test");
    }

    @AfterMethod
    public void stopTest(){
        logger.info("Stop test");
    }

    @BeforeMethod
    public void init() throws MalformedURLException {
        caps = new DesiredCapabilities();
        final String baseDir = System.getProperty("user.dir") + "/app";
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0.0");
        caps.setCapability("deviceName", "qa11_mob");
        caps.setCapability("automationName", "Appium");
        caps.setCapability("appPackage", "io.ionic.starter");
        caps.setCapability("appActivity", "io.ionic.starter.MainActivity");
        caps.setCapability("app", baseDir + "/app-debug.apk");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    // io.ionic.starter/io.ionic.starter.MainActivity

    @Test
    public void start() {
        System.out.println("app started");
    }

    @AfterMethod (enabled = false)
    public void quitApp() {
        driver.closeApp();
        driver.quit();
    }

}
