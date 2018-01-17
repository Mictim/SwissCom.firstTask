package com.swiss.tasks.tests;

import com.swiss.tasks.PageObjects.SearchPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class SearchByNameTest extends BaseTest{

    @Test
    @Parameters({"name", "assertMinValue", "assertMaxValue"})
    public void searchByName(String name, int assertMinValue, int assertMaxValue){
        assertThat(new SearchPage().
                        inputSearchCriteria(name).
                        getSearchResultsCount(),
                   allOf(greaterThan(assertMinValue), lessThan(assertMaxValue)));
    }

}
