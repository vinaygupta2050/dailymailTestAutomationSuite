package com.dailymailapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author : Vinaykumar Gupta
 * @Date 04/06/23
 */
public class TelevisionPageObject {

    @FindBy(xpath = "//h1[contains(@class,'')]")
    public WebElement lblPageHeader;

    @FindBy(xpath = "//h1[contains(@class,'')]/../span/p")
    public WebElement lblPageDescription;

    @FindBy(xpath = "//div[@data-testid=\"articles-content\"]")
    public WebElement articalSection;

}
