package com.dailymailapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author : Vinaykumar Gupta
 * @Date 04/06/23
 */
public class NavigationbarPageObject {

    @FindBy(xpath = "//div[@data-testid='menu-item' and normalize-space()='Home']")
    public WebElement btnMenuHome;

    @FindBy(xpath = "//div[@data-testid='menu-item'][2]")
    public WebElement btnMenuTech;

    @FindBy(xpath = "//div[@data-testid='menu-item'][3]")
    public WebElement btnMenuTravel;

    @FindBy(xpath = "//div[@data-testid='menu-item'][4]")
    public WebElement btnMenuHomeGarden;

    @FindBy(xpath = "//div[@data-testid='menu-item'][5]")
    public WebElement btnMenuBeautyWellness;

    @FindBy(xpath = "//div[@data-testid='menu-item'][5]")
    public WebElement btnMenuMoreCategory;

    @FindBy(xpath = "//ul/a[@data-testid='menu-dropdown-item-text']/span[text()='Televisions']")
    public WebElement btnSubMenuTelevision;
}
