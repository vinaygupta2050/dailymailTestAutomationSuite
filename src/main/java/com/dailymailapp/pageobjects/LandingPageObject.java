package com.dailymailapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author : Vinaykumar Gupta
 * @Date 04/06/23
 */
public class LandingPageObject {
    @FindBy(xpath = "//*[@id=\"logo\"]")
    public WebElement lblTitle;
    @FindBy(xpath = "//*[@id=\"cmpbntyestxt\"]")
    public WebElement btnAcceptCookies;


}
