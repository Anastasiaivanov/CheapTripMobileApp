package com.telran.cheaptrip.tests;

import com.telran.cheaptrip.pages.MainPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests extends TestBase {

    MainPageHelper mainPage;

    @BeforeMethod
    public void initTest() {
        mainPage = PageFactory.initElements(driver, MainPageHelper.class);
    }

    @Test
    public void start() {
        System.out.println("app started");
        mainPage.takeScreenshot();
    }

    @Test
    public void toContactAndBackTest() throws InterruptedException {
        mainPage.findHamburger();
        mainPage.findContacts();
        mainPage.findHomeButton();
    }

}
