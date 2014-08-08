package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by caleb.carvalho on 07/08/2014.
 */
public class HomePage {



    @FindBy(partialLinkText="Sport")

    @CacheLookup //only used for non-ajax or same static page
    private WebElement clickLink;

    @CacheLookup
    @FindBy(tagName = "a")
    private List<WebElement> links;


    private WebElement clickALink;

       public void setClickLink() {
        // And here we use it. Note that it looks like we've
        // not properly instantiated it yet....
        clickLink.click();
    }

    public List<WebElement> listPageLink(){

        return  links;
    }


}
