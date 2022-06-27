package com.qaprosoft.carina.demo;/*
com.qaprosoft.carina.demo
carina-demo-master
Popchiyk
23.06.2022 06 18:05 2022 */

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.components.LoginComponent;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.ForgotPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebAccountTest implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "PopiukRoman")
    @TestPriority(Priority.P2)
    public void testLoginToAccount() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginComponent loginComponent = homePage.getNavBarMenu().openLoginForm();
        Assert.assertTrue(loginComponent.isEmailFieldPresent(), "Email field is not present");
        Assert.assertTrue(loginComponent.isLoginButtonPresent(), "Button login is not present");
        Assert.assertTrue(loginComponent.isForgotEmailButtonPresent(), "Forgot email button is not present");
        Assert.assertTrue(loginComponent.isPasswordFieldPresent(), "Password field is not present");
        Assert.assertTrue(loginComponent.isLoginTitlePresent(), "Login field is not present");
        Assert.assertNotNull(loginComponent.hoverLoginButton(),"Don`t hover to login button");
        Assert.assertNotNull(loginComponent.clickLoginButton(),"Don`t click to login button" );
        loginComponent.loginToAccount("asdadsdas", "1");
        loginComponent.loginToAccount("asdadsdas@gmail.com", "1");
        loginComponent.loginToAccount("vayad47535@tagbert.com", "123456");
        AccountPage accountPage = homePage.getNavBarMenu().openAccountPage();
        Assert.assertTrue(accountPage.isPageOpened(), "Account page is not opened");
    }

    @Test()
    @MethodOwner(owner = "PopiukRoman")
    @TestPriority(Priority.P3)
    public void testForgotPassword() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginComponent loginComponent = homePage.getNavBarMenu().openLoginForm();
        ForgotPage forgotPage = loginComponent.clickForgotEmailButton();
        Assert.assertTrue(forgotPage.isPageOpened(), "Forgot page is not opened");
        Assert.assertTrue(forgotPage.isEmailFieldPresent(), "Email field is not present");
        Assert.assertTrue(forgotPage.isForgotButtonPresent(), "Button forgot is not present");
        forgotPage.submitForgotPassword("vayad47535@tagbert.com");
        pause(2);
    }

    @Test()
    @MethodOwner(owner = "Popiuk Roman")
    @TestPriority(Priority.P1)
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
    }

}
