package com.qaprosoft.carina.demo;/*
com.qaprosoft.carina.demo
carina-demo-master
Popchiyk
23.06.2022 06 18:05 2022 */

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.LoginComponent;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSignInTest implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "PopiukRoman")
    public void testLoginForm(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginComponent loginComponent = homePage.getNavBarMenu().openLoginForm();
        Assert.assertTrue(loginComponent.isEmailFieldPresent(),"Email field is not present");
        Assert.assertTrue(loginComponent.isLoginButtonPresent(),"Button login is not present");
        Assert.assertTrue(loginComponent.isForgotEmailButtonPresent(),"Forgot email button is not present");
        Assert.assertTrue(loginComponent.isPasswordFieldPresent(),"Password field is not present");
        Assert.assertTrue(loginComponent.isLoginTitlePresent(),"Login title is not present");
        loginComponent.loginToAccountHoverButtonAndClick();
        pause(2);
        loginComponent.loginToAccount("asdadsdas","1");
        pause(2);
        loginComponent.loginToAccount("asdadsdas@gmail.com","1");
        pause(2);
        loginComponent.loginToAccount("vayad47535@tagbert.com","123456");
        pause(3);
        AccountPage accountPage = homePage.getNavBarMenu().openAccountPage();
        Assert.assertTrue(accountPage.isPageOpened(), "Account page is not opened");
        pause(1);
    }


}