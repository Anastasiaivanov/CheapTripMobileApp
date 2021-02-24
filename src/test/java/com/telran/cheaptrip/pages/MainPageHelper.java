package com.telran.cheaptrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHelper extends PageBase {

    private static final String TRIP_PANEL_XPATH = "/hierarchy" +
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

    private static final String XPATH_FOR_CONTACT = "/hierarchy" +
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
            "/android.view.";

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

    @FindBy(xpath = XPATH_FOR_CONTACT + "View/android.view.View/android.view.View" +
            "/android.view.View/android.view.View/android.view.View" +
            "/android.view.View[1]/android.view.View[2]/android.view.View[1]" +
            "/android.view.View/android.widget.Button")
    WebElement hamburgerFromMainPage;

    @FindBy(xpath = XPATH_FOR_CONTACT + "View/android.view.View/android.view.View[1]" +
            "/android.view.View[1]/android.view.View[2]/android.view.View[1]" +
            "/android.view.View/android.widget.Button")
    WebElement hamburgerFromContactPage;

    @FindBy(xpath = XPATH_FOR_CONTACT + "View[2]/android.view.View/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.view.View[3]" +
            "/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View")
    WebElement contacts;

    @FindBy(xpath = XPATH_FOR_CONTACT + "View/android.view.View/android.view.View[1]" +
            "/android.view.View[1]/android.view.View[2]" +
            "/android.view.View[2]/android.view.View")
    WebElement contactData;

    @FindBy(xpath = XPATH_FOR_CONTACT + "View[1]/android.view.View[1]/android.view.View" +
            "/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View")
    WebElement homeButton;

    public void findHamburger() {
        hamburgerFromMainPage.click();
        waitUntilElementVisible(contacts, 3);
    }

    public void findContacts() {
        contacts.click();
        waitUntilElementVisible(contactData, 10);
    }

    public void findHomeButton() {
        hamburgerFromContactPage.click();
        homeButton.click();
    }

}
