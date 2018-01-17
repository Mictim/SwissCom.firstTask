package com.swiss.tasks.PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsDetailedPrivatePage extends SearchResultsPage {

    public SelenideElement getSearchResultName(){
        return $(By.cssSelector("table h1"));
    }

    public SelenideElement getSearchResultAddress(){
        return $(By.cssSelector("span.street-address"));
    }

    public SelenideElement getSearchResultPostalCode(){
        return $(By.cssSelector("span.tel-zipcity span.postal-code"));
    }

    public SelenideElement getSearchResultPostalLocality(){
        return $(By.cssSelector("span.tel-zipcity span.postal-locality"));
    }

    public SelenideElement getSearchResultPostalRegion(){
        return $(By.cssSelector("span.tel-zipcity span.postal-region"));
    }

    public SelenideElement getSearchResultPhoneNumber(){
        return $(By.cssSelector("table.sl-contact-table a.value"));
    }

}
