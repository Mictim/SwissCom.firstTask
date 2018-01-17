package com.swiss.tasks.tests;

import com.codeborne.selenide.testng.ScreenShooter;
import com.swiss.tasks.pageObjects.SearchPage;
import com.swiss.tasks.vo.SearchCriteria;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

@Listeners(ScreenShooter.class)
public class EmptySearchResultTest {

    @Test
    @Parameters({"searchString", "searchLocation"})
    public void emptySearchResultsTest(String searchString, String searchLocation){
        new SearchPage().
                getResults(new SearchCriteria(searchString, searchLocation)).
                getSearchResultsCountElement().
                shouldHave(text("0"));
    }
}
