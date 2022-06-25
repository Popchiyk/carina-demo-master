package com.qaprosoft.carina.demo.gui.components;/*
com.qaprosoft.carina.demo.gui.components
carina-demo-master
Popchiyk
23.06.2022 06 18:03 2022 */

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.ForgotPage;
import com.qaprosoft.carina.demo.gui.pages.SignInPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginComponent extends AbstractUIObject {

    @FindBy(xpath = "//p[text()='Login']")
    private ExtendedWebElement loginField;//*title

    @FindBy(id = "email")
    private ExtendedWebElement emailTextField;

    @FindBy(id = "upass")
    private ExtendedWebElement passwordTextField;

    @FindBy(id = "nick-submit")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[@class='forgot']")
    private ExtendedWebElement forgotEmailButton;

    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    public LoginComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isLoginTitlePresent() {
        return loginField.isElementPresent();
    }

    public boolean isEmailFieldPresent() {
        return emailTextField.isElementPresent();
    }

    public boolean isPasswordFieldPresent() {
        return passwordTextField.isElementPresent();
    }

    public boolean isLoginButtonPresent() {
        return loginButton.isElementPresent();
    }

    public boolean isForgotEmailButtonPresent() {
        return forgotEmailButton.isElementPresent();
    }

    public LoginComponent typeEmail(String email) {
        emailTextField.type(email);
        return this;
    }

    public LoginComponent typePassword(String password) {
        passwordTextField.type(password);
        return this;
    }

    public LoginComponent clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginComponent hoverLoginButton() {
        loginButton.hover();
        return this;
    }

    public ForgotPage clickForgotEmailButton() {
        forgotEmailButton.click();
        return new ForgotPage(driver);
    }

    public SignInPage loginToAccount(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickLoginButton();
        return new SignInPage(driver);
    }

    public void loginToAccountHoverButtonAndClick() {
        hoverLoginButton();
        pause(2);
        clickLoginButton();
        pause(2);
    }
}
