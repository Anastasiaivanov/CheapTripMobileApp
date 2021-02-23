package com.telran.cheaptrip.tests;

import com.telran.cheaptrip.pages.SwitchHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchTest extends TestBase{
    SwitchHelper switch_A;

    @BeforeMethod
    public void initTest(){
        switch_A= PageFactory.initElements(driver,SwitchHelper.class);
    }
    //Check the language switching menu into Russian
    @Test
    public void switchLanquagesTest(){
        switch_A.selectFromRussianLanguage();
    }
    //Check the language switching menu into English
    @Test
    public void switchLanquagesTestEN(){
        switch_A.selectFromRussianLanguage();
        switch_A.selectFromEnglishLanguage();
    }

    // Check the currency switching menu
    @Test
    public void switchCurrencyTestToUSD(){
        switch_A.SelectCurrencyUSD();
    }
   /* @Test
    public void switchCurrencyTestToEUR(){
        switch_A.SelectCurrencyUSD();
        switch_A.SelectCurrencyEUR();
    }*/

}


