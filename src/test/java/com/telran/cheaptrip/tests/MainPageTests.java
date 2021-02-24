package com.telran.cheaptrip.tests;

import com.telran.cheaptrip.pages.MainPageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
        Thread.sleep(4000);
        mainPage.findHamburger();
        mainPage.findContacts();
        Thread.sleep(1000);
        mainPage.findHomeButton();
        WebElement homepage = driver.findElement(By.xpath("/hierarchy" +
                "/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.webkit.WebView/android.webkit.WebView" +
                "/android.view.View/android.view.View/android.view.View" +
                "/android.view.View/android.view.View/android.view.View" +
                "/android.view.View/android.view.View/android.view.View" +
                "/android.view.View[3]/android.view.View[2]" +
                "/android.view.View/android.view.View[2]"));
        Assert.assertTrue(mainPage.isElementPresent(homepage));
    }

}
