package com.swiss.tasks.PageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

public class SearchPage {

    private void setSearchString(String searchText){
        $(By.name("was")).setValue(searchText);
    }

    private void setSearchLocation(String searchLocation){
        $(By.name("wo")).setValue(searchLocation);
    }

    private void submit(){
        $(By.xpath("//form[@id='tel-form-simple']/div/input[@value='Search']")).click();
    }

    public SearchResultsPage inputSearchCriteria(String searchText){
        setSearchString(searchText);
        submit();
        return page(SearchResultsPage.class);
    }

    public SearchResultsPage inputSearchCriteria(String searchText, String searchLocation){
        setSearchString(searchText);
        setSearchLocation(searchLocation);
        submit();

        return new SearchResultsPage();
    }
}
