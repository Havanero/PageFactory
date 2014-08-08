package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by caleb.carvalho on 08/08/2014.
 */
public class EtsyMain {

    private final WebDriver driver;

    @CacheLookup
    @FindBy(name = "search_query")
    private WebElement searchText;

    public EtsyMain(WebDriver driver){
        this.driver=driver;
    }

    public void checkPageTitle(String title){

        if (!title.equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the " + title + "Page");
        }
     }

   public EtsyMain setSearchText(String search){

       searchText.sendKeys(search);

       return this;
   }
}
