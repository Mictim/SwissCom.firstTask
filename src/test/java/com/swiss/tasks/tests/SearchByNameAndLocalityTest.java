package com.swiss.tasks.tests;

import com.swiss.tasks.pageObjects.SearchPage;
import com.swiss.tasks.pageObjects.SearchResultsDetailedPrivatePage;
import com.swiss.tasks.vo.SearchCriteria;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Condition.text;

public class SearchByNameAndLocalityTest extends BaseTest{

    @Test
    @Parameters({"searchString", "searchLocation", "expectedPhoneNumber"})
    public void searchByNameAndLocationPhoneNumAssert(String searchString, String searchLocation, String expectedPhoneNumber){
        SearchResultsDetailedPrivatePage searchResultsDetailedPrivatePage =
                (SearchResultsDetailedPrivatePage) new SearchPage().getResults(new SearchCriteria(searchString, searchLocation));
        searchResultsDetailedPrivatePage.getSearchResultPhoneNumber().
                shouldHave(text(expectedPhoneNumber));
    }
}
