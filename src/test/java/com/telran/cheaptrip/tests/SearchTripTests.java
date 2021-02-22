package com.telran.cheaptrip.tests;

import com.telran.cheaptrip.pages.MainPageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTripTests extends  TestBase {

    MainPageHelper mainPageHelper;

    @BeforeMethod
    public void initTest() {
        mainPageHelper = PageFactory.initElements(driver, MainPageHelper.class);
    }

    @Test
    public void fillInTripForm() throws InterruptedException {
        mainPageHelper.fillInFromTypeForm("Berlin");
        Thread.sleep(100);
        mainPageHelper.fillInToTypeForm("Moscow");
        driver.hideKeyboard();
        Thread.sleep(100);
        mainPageHelper.clickOnLetsGoButton();
        WebElement tripContainer = driver.findElement(By.xpath("/hierarchy" +
                "/android.widget.FrameLayout" +
                "/android.widget.LinearLayout" +
                "/android.widget.FrameLayout" +
                "/android.widget.LinearLayout" +
                "/android.widget.FrameLayout" +
                "/android.view.ViewGroup" +
                "/android.webkit.WebView" +
                "/android.webkit.WebView" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View" +
                "/android.view.View[3]" +
                "/android.view.View[2]" +
                "/android.view.View[3]"));
        Assert.assertTrue(mainPageHelper.isElementPresent(tripContainer));
    }
}
