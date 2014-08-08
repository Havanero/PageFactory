package com.tests;

import com.pages.EtsyMain;
import com.pages.EtsySearch;
import com.pages.EtsySearchResults;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by caleb.carvalho on 08/08/2014.
 */
public class EtsyTest {
    Logger logger = Logger.getLogger("");
    WebDriver driver;

    @Test
    public void TestMe() {

        logger.setLevel(Level.OFF);
        driver = new HtmlUnitDriver();

       // FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\Caleb.Carvalho\\AppData\\Local\\Mozilla Firefox\\firefox.exe\\"));
        //FirefoxProfile profile = new FirefoxProfile();
        //driver = new FirefoxDriver(binary,profile); //opted for Firefox driver.

        driver.get("https://www.etsy.com/");
        System.out.println(driver.getTitle());

        EtsyMain mainPage = PageFactory.initElements(driver,EtsyMain.class);
        mainPage.checkPageTitle("Etsy - Your place to buy and sell all things handmade, vintage, and supplies");
        mainPage.setSearchText("collar");

        EtsySearch search = PageFactory.initElements(driver,EtsySearch.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        search.searchResults();

        EtsySearchResults res= PageFactory.initElements(driver,EtsySearchResults.class);

        System.out.println("Res==" +res.getResultsView());
        System.out.println(driver.getTitle());


    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
