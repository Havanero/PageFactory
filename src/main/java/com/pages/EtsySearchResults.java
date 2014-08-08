package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by caleb.carvalho on 08/08/2014.
 */
public class EtsySearchResults {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search-header\"]/h1/span")

    private WebElement resultsView;
    //result-count summary
    public EtsySearchResults(WebDriver driver){
        this.driver=driver;
    }

    public String getResultsView(){

        return  resultsView.getText();
    }

}
