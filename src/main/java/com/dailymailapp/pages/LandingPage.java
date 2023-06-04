package com.dailymailapp.pages;

import com.dailymailapp.factories.BasePage;
import com.dailymailapp.pageobjects.LandingPageObject;
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
public class LandingPage extends BasePage {

    private LandingPageObject landingPageObject;
    private Logger log = Logger.getLogger(String.valueOf(LandingPage.class));

    public LandingPage(WebDriver driver) {
        super(driver);
        this.landingPageObject = new LandingPageObject();
        PageFactory.initElements(driver, landingPageObject);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public LandingPage acceptAllCookie()
    {
        waitForElementToBeVisible(landingPageObject.btnAcceptCookies,30);
        landingPageObject.btnAcceptCookies.click();
        return this;
    }
    public LandingPage verifyTitle() {
        waitForElementToBeVisible(landingPageObject.lblTitle, 30);
        log.info("Verifying screen title");
        Assert.assertTrue(landingPageObject.lblTitle.isDisplayed());
        log.info("Verification Successfull!!!");
        return this;
    }

    public TelevisionPage selectCategoryAndSubCategoryAs(String categoryName, String subCategoryName) {
        new NavigationBar(driver).selectCategory(categoryName,subCategoryName);
        return new TelevisionPage(driver);
    }

}
