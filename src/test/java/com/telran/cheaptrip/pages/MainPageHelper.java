package com.telran.cheaptrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHelper extends PageBase {

    private static final String TRIP_PANEL_XPATH ="/hierarchy" +
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
            "/android.view.View";

    public MainPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[1]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[2]" +
            "/android.widget.EditText")
    WebElement fromLine;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[1]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[2]" +
            "/android.widget.EditText")
    WebElement submitCityFrom;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[2]" +
            "/android.widget.EditText")
    WebElement toLine;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View[2]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View[1]" +
            "/android.view.View" +
            "/android.view.View" +
            "/android.widget.Button")
    WebElement submitCityTo;

    @FindBy(xpath = TRIP_PANEL_XPATH +
            "/android.view.View[2]" +
            "/android.view.View[3]" +
            "/android.view.View[2]" +
            "/android.view.View")
    WebElement letsGoButton;


    public void fillInFromTypeForm(String textInput) {
        fromLine.click();
        inputTextToField(fromLine, textInput);
        waitUntilElementVisible(submitCityFrom, 5);
        submitCityFrom.click();
    }


    public void fillInToTypeForm(String textInput) {
        toLine.click();
        inputTextToField(toLine, textInput);
        waitUntilElementVisible(submitCityTo, 5);
        submitCityTo.click();
    }

    public void clickOnLetsGoButton() {
        letsGoButton.click();
    }

    @FindBy(id = "main-content")
    WebElement homepage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")
    WebElement hamburger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View")
    WebElement contacts;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]")
    WebElement contactData;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ListView/android.widget.Button")
    WebElement homeButton;

    public void findHamburger() throws InterruptedException {
        Thread.sleep(8000);
        hamburger.click();
        waitUntilElementVisible(contacts, 3);
    }

    public void findContacts() {
        contacts.click();
        waitUntilElementVisible(contactData, 10);
    }

    public void findHomeButton() throws InterruptedException {
        Thread.sleep(1000);
        hamburger.click();
        homeButton.click();
        assert isElementPresent(homepage);
    }

}
