package com.qaprosoft.carina.demo;/*
com.qaprosoft.carina.demo
carina-demo-master
Popchiyk
23.06.2022 06 17:08 2022 */

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSignUpTest implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "Popiuk Roman")
    public void testSignUp() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        SignUpPage signUpPage = homePage.getNavBarMenu().clickSignUpButton();
        Assert.assertTrue(signUpPage.isEmailTitlePresent(), "Email field is not present");
        Assert.assertTrue(signUpPage.isSighUpButtonPresent(), "Button sign up is not present");
        Assert.assertTrue(signUpPage.isCheckBoxAgreeRulePresent(), "Checkbox agree rule is not present");
        Assert.assertTrue(signUpPage.isCheckBoxAgreeOldPresent(), "Checkbox agree old is not present");
        Assert.assertTrue(signUpPage.isPasswordTitlePresent(), "Password field is not present");
        Assert.assertTrue(signUpPage.isLoginTitlePresent(), "Login title is not present");
        signUpPage.signUpAccount("qwerty1337", "qwerty1337@gmail.com", "qwerty321");
        pause(1);
    }

}
