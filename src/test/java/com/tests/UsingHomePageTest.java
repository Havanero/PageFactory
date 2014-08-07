package com.tests;

import com.pages.HomePage;
import com.pages.SearchPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by caleb.carvalho on 07/08/2014.
 */
public class UsingHomePageTest {


//@Test
public void TestMe() {

    WebDriver driver = new HtmlUnitDriver();
    driver.get("http://www.google.com/");
    System.out.println(driver.getTitle());
    // Create a new instance of the search page class
    // and initialise any WebElement fields in it.
    SearchPage page = PageFactory.initElements(driver, SearchPage.class);
    page.searchFor("Cheese!");

    }

    @Test
    public void TestHome() {

        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.bbc.co.uk");
        System.out.println(driver.getTitle());
        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        HomePage page = PageFactory.initElements(driver, HomePage.class);
        page.searchFor();
        System.out.println(driver.getTitle());

    }

}
