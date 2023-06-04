package com.dailymailapp.pages;

import com.dailymailapp.factories.BasePage;
import com.dailymailapp.pageobjects.NavigationbarPageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author : Vinaykumar Gupta
 * @Date 04/06/23
 */
public class NavigationBar extends BasePage {
    private NavigationbarPageObject navigationBarPageObject;
    private Logger log = Logger.getLogger(String.valueOf(LandingPage.class));

    public NavigationBar(WebDriver driver) {
        super(driver);
        this.navigationBarPageObject = new NavigationbarPageObject();
        PageFactory.initElements(driver, navigationBarPageObject);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void selectCategory(String categoryName,String subCategoryName) {
        log.info("Selecting Category as : "+categoryName);
        log.info("Selecting SubCategory as : "+subCategoryName);
        Actions actions = new Actions(driver);
        WebElement category = null;
        WebElement subCategory = null;
        switch (categoryName.toUpperCase())
        {
            case "TECH":
                category = navigationBarPageObject.btnMenuTech;
                break;
            case "TRAVEL":
                category = navigationBarPageObject.btnMenuTravel;
                break;
            case "HOME&GARDEN":
                category = navigationBarPageObject.btnMenuTravel;
                break;
            case "BEAUTY&WELLNESS":
                category = navigationBarPageObject.btnMenuBeautyWellness;
                break;
            case "MORE CATEGORIES":
                category = navigationBarPageObject.btnMenuMoreCategory;
                break;

        }
        subCategory = driver.findElement(By.xpath("//ul/a[@data-testid='menu-dropdown-item-text']/span[text()='"+subCategoryName+"']"));
        actions.moveToElement(category).click(subCategory).build().perform();
    }
}
