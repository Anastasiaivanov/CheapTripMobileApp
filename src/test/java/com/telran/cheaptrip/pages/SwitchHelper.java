package com.telran.cheaptrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwitchHelper extends PageBase {
    public SwitchHelper(WebDriver driver) {
        super(driver);
    }


    //@FindBy(css = "ion-buttons.select.buttons-last-slot.sc-ion-buttons-md-h.sc-ion-buttons-md-s.md.hydrated")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view" +
            ".View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]" +
            "/android.view.View/android.widget.ListView/android.widget.Button")

    WebElement selectLang;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/" +
            "android.view.View/android.widget.RadioButton/android.widget.Button")

    WebElement langRus;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/" +
            "android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton/android.widget.Button")

    WebElement langEn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]" +
            "/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/" +
            "android.view.View/android.widget.ListView/android.widget.Button")
    WebElement selectCurrency;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/" +
            "android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton/android.widget.Button")
        WebElement choosingUSD;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton/android.widget.Button")
        WebElement choosingEUR;


    public void selectFromRussianLanguage() {
        waitUntilElementVisible(selectLang, 2);
        selectLang.click();
        langRus.click();
    }

    public void selectFromEnglishLanguage() {
        waitUntilElementVisible(selectLang, 2);
        selectLang.click();
        langEn.click();
    }

    public void SelectCurrencyUSD(){
        waitUntilElementVisible(selectCurrency, 2);
        selectCurrency.click();
        waitUntilElementVisible(choosingUSD, 3);
        choosingUSD.click();
    }
    /*public void SelectCurrencyEUR(){
        waitUntilElementVisible(selectCurrency, 2);
        selectCurrency.click();
        waitUntilElementVisible(choosingUSD, 3);
        choosingUSD.click();
        waitUntilElementVisible(selectCurrency, 2);
        selectCurrency.click();
        //waitUntilElementVisible(choosingEUR, 3);
        choosingEUR.click();
    }*/


}
