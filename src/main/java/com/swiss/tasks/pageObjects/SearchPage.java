package com.swiss.tasks.pageObjects;

import com.codeborne.selenide.SelenideElement;
import com.swiss.tasks.vo.SearchCriteria;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class SearchPage {

    private SearchPageHeader header = new SearchPageHeader();

    private SelenideElement resultCounter = $(By.cssSelector("span.tel-result-count"));

    private void submitSearch(){
        $(By.xpath("//form[@id='tel-form-simple']/div/input[@value='Search']")).click();
    }

    public SearchResultsPage getResults(SearchCriteria searchCriteria){
        header.inputSearchCriteria(searchCriteria);
        submitSearch();
        if (Integer.parseInt(resultCounter.getText()) == 1){
            return new SearchResultsDetailedPrivatePage();
        } else {
            return new SearchResultsPage();
        }
    }

}
