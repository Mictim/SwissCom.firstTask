package com.swiss.tasks.tests;

import com.swiss.tasks.PageObjects.SearchPage;
import com.swiss.tasks.PageObjects.SearchResultsDetailedPrivatePage;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Condition.exactText;


public class SearchByNameAndLocalityTest extends BaseTest{

    @Test
    @Parameters({"name", "location", "expectedPhoneNumber"})
    public void searchByNameAndLocationPhoneNumAssert(String name, String location, String expectedPhoneNumber){
        SearchResultsDetailedPrivatePage search = (SearchResultsDetailedPrivatePage) new SearchPage().inputSearchCriteria(name, location);
        search.getSearchResultPhoneNumber().shouldHave(exactText(expectedPhoneNumber));
    }
}
