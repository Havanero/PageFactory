package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by caleb.carvalho on 08/08/2014.
 */
public class EtsySearch {

    private WebDriver driver;


    @FindBy(xpath = "//*[@id='search-bar']/div/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"search-header\"]/h1/span")
    private WebElement res;


    public EtsySearch(WebDriver driver){
        this.driver=driver;
    }

    public EtsySearchResults searchResults(){

        searchButton.submit();

        System.out.print(res.isDisplayed());

      return new EtsySearchResults(driver);

    }
}
