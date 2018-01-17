package com.swiss.tasks.tests;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

import com.swiss.tasks.Support;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;


public class BaseTest {
    @BeforeClass
    public void setUp(){
        Properties props = new Properties();
        try {
           props  = new Support().getProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String browser = props.getProperty("browser");
        System.out.println("BROWSER = " + browser);
        switch(browser){
            case ("chrome"):
                System.setProperty("webdriver.chrome.driver", "/Users/imac/DevTools/chromedriver");
                Configuration.browser = "chrome";
                break;
            default:

        }

        open("https://tel.search.ch/index.en.html");
    }
}
