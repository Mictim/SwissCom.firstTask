package com.swiss.tasks.PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {

    public int getSearchResultsCount(){
        return Integer.parseInt($(By.cssSelector("span.tel-result-count")).getText());
    }

}
