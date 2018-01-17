package com.swiss.tasks.pageObjects;

import com.swiss.tasks.vo.SearchCriteria;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageHeader {
    private void setSearchString(String searchText){
        if (searchText != null)
        $(By.name("was")).setValue(searchText);
    }

    private void setSearchLocation(String searchLocation){
        if (searchLocation != null)
        $(By.name("wo")).setValue(searchLocation);
    }



    public SearchPage inputSearchCriteria(SearchCriteria searchCriteria){
        setSearchString(searchCriteria.getSearchString());
        setSearchLocation(searchCriteria.getSearchLocation());
        return new SearchPage();
    }


}
