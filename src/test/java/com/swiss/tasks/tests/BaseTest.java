package com.swiss.tasks.tests;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;
import org.testng.annotations.BeforeClass;



public class BaseTest {
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/imac/DevTools/chromedriver");
        Configuration.browser = "chrome";
        open("https://tel.search.ch/index.en.html");
    }
}
