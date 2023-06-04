package com.dailymailapp.test;

import com.dailymailapp.factories.BaseTest;
import com.dailymailapp.pages.LandingPage;
import org.testng.annotations.Test;

/**
 * @author : Vinaykumar Gupta
 * @Date 04/06/23
 */
public class ViewArticleFlow extends BaseTest {

    private static final String CATEGORY_TECH="TECH";
    private static final String CATEGORY_TRAVEL="TRAVEL";
    private static final String CATEGORY_HOME_AND_GARDEN="HOME&GARDEN";
    private static final String CATEGORY_BEAUTY_AND_WELLNESS="BEAUTY&WELLNESS";
    private static final String CATEGORY_MORE_CATEGORY="MORE CATEGORY";

    @Test(enabled = true, description = "Verify whether user is able to view article list based on category selected",
            groups = "Task1")
    public void verifyUserIsAbleToViewArticleListBasedOnCategorySelected() {
        LandingPage landingPage = new LandingPage(driver.get());
        landingPage.acceptAllCookie().verifyTitle()
                .selectCategoryAndSubCategoryAs(CATEGORY_TECH,"Televisions")
                .verifySubCategoryTitle("Televisions")
                .verifySubCategoryDescription("The right TV can make spending time at home feel like a luxury. Whether you’re looking for a big-screen setup, a smart TV to stream your favorite shows or a more discreet option to match your home decor, we’ve got you covered. Our editors have done extensive research and compared across top brands to help you find the perfect TV — with the exact screen size, features and resolution that you’re after.")
                .verifyArticleSectionIsDisplayed();
    }
}
