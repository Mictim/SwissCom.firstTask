package com.swiss.tasks.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {

    public int getSearchResultsCount(){
        return Integer.parseInt(getSearchResultsCountElement().getText());
    }

    public SelenideElement getSearchResultsCountElement(){
        return $(By.cssSelector("span.tel-result-count"));
    }

}
