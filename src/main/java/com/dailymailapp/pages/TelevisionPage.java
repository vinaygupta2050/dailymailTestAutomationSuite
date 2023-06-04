package com.dailymailapp.pages;

import com.dailymailapp.factories.BasePage;
import com.dailymailapp.pageobjects.LandingPageObject;
import com.dailymailapp.pageobjects.NavigationbarPageObject;
import com.dailymailapp.pageobjects.TelevisionPageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * @author : Vinaykumar Gupta
 * @Date 04/06/23
 */
public class TelevisionPage extends BasePage {

    private TelevisionPageObject televisionPageObject;
    private Logger log = Logger.getLogger(String.valueOf(TelevisionPage.class));

    public TelevisionPage(WebDriver driver) {
        super(driver);
        this.televisionPageObject = new TelevisionPageObject();
        PageFactory.initElements(driver, televisionPageObject);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public TelevisionPage verifySubCategoryTitle(String expectedHeaderTitle)
    {
        String actualCategoryTitle = televisionPageObject.lblPageHeader.getText();
        log.info("Expected Category Title :"+expectedHeaderTitle);
        log.info("Actual Category Title :"+expectedHeaderTitle);
        Assert.assertEquals(actualCategoryTitle,expectedHeaderTitle);
        return this;
    }
    public TelevisionPage verifySubCategoryDescription(String expectedDescription)
    {
        String actualCategoryDescription = televisionPageObject.lblPageDescription.getText();
        log.info("Expected Category Title :"+expectedDescription);
        log.info("Actual Category Title :"+actualCategoryDescription);
        Assert.assertEquals(actualCategoryDescription,expectedDescription);
        return this;
    }
    public TelevisionPage verifyArticleSectionIsDisplayed()
    {
        log.info("Verifying article list is displayed :"+televisionPageObject.articalSection.isDisplayed());
        Assert.assertTrue(televisionPageObject.articalSection.isDisplayed());
        return this;
    }
}
