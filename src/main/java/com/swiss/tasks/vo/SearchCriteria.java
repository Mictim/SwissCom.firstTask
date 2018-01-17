package com.swiss.tasks.vo;

public class SearchCriteria {
    private String searchString;
    private String searchLocation;

    public SearchCriteria (String searchString, String searchLocation){
        this.searchString = searchString;
        this.searchLocation = searchLocation;
    }

    public String getSearchString() {
        return searchString;
    }

    public String getSearchLocation() {
        return searchLocation;
    }
}
