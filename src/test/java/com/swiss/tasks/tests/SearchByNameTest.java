package com.swiss.tasks.tests;

import com.swiss.tasks.pageObjects.SearchPage;
import com.swiss.tasks.vo.SearchCriteria;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class SearchByNameTest extends BaseTest{

    @Test
    @Parameters({"searchString", "assertMinValue", "assertMaxValue"})
    public void searchByName(String searchString, int assertMinValue, int assertMaxValue){
        assertThat(new SearchPage().
                        getResults(new SearchCriteria(searchString, null)).
                        getSearchResultsCount(),
                   allOf(greaterThan(assertMinValue), lessThan(assertMaxValue)));
    }

}
