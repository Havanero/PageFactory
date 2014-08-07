package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by caleb.carvalho on 07/08/2014.
 */
public class SearchPage {
    // The element is now looked up using the name attribute
    @FindBy(name="q")

    @CacheLookup //only used for non-ajax or same static page
    private WebElement searchBox;

    public void searchFor(String text) {
        // And here we use it. Note that it looks like we've
        // not properly instantiated it yet....
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
