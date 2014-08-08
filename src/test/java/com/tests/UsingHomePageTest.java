package com.tests;

import com.pages.HomePage;
import com.pages.SearchPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by caleb.carvalho on 07/08/2014.
 */
public class UsingHomePageTest {
    Logger logger = Logger.getLogger("");

 @Test
public void TestMe() {


    logger.setLevel (Level.OFF);
    WebDriver driver = new HtmlUnitDriver();
    driver.get("http://www.google.com/");
    System.out.println(driver.getTitle());
    // Create a new instance of the search page class
    // and initialise any WebElement fields in it.
    SearchPage page = PageFactory.initElements(driver, SearchPage.class);
    page.searchFor("Cheese!");

    }

   // @Test
    public void BBCHome() {

        logger.setLevel (Level.OFF);
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.bbc.co.uk");
        System.out.println(driver.getTitle());
        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        HomePage page = PageFactory.initElements(driver, HomePage.class);
        page.setClickLink();
        System.out.println(driver.getTitle());
        List<WebElement> ite=page.listPageLink();

        for(WebElement allLinks:ite){

            if(!allLinks.getText().equals(null))
                System.out.println(allLinks.getText());

            if(allLinks.getText().equals("Results")) {
                System.out.println("found Results...");
               // page.clickLink("Results");
            }

        }

    }

   // @Test
    public void Guardian() {

        logger.setLevel (Level.OFF);

        WebDriver driver = new HtmlUnitDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://www.theguardian.com/uk");
        System.out.println(driver.getTitle());

        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        HomePage page = PageFactory.initElements(driver, HomePage.class);
        page.setClickLink();
        System.out.println(driver.getTitle());

        List<WebElement> ite=page.listPageLink();

        for(WebElement allLinks:ite){

            if(!allLinks.getText().equals(null))
            System.out.println(allLinks.getText());
        }

    }



}
