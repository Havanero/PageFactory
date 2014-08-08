package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by caleb.carvalho on 08/08/2014.
 */
public class EtsySearch {

    private WebDriver driver;


    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    //search_submit

    public EtsySearch(WebDriver driver){
        this.driver=driver;
    }

    public EtsySearchResults searchResults() {

        searchButton.submit();

      return new EtsySearchResults(driver);
    }

}
