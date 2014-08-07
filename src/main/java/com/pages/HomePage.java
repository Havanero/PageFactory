package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by caleb.carvalho on 07/08/2014.
 */
public class HomePage {


    @FindBy(partialLinkText="Sport")


    @CacheLookup //only used for non-ajax or same static page
    private WebElement clickLink;

    public void searchFor() {
        // And here we use it. Note that it looks like we've
        // not properly instantiated it yet....
        clickLink.click();

    }
}
