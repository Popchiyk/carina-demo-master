package com.qaprosoft.carina.demo.gui.components;/*
com.qaprosoft.carina.demo.gui.components
carina-demo-master
Popchiyk
23.06.2022 06 16:46 2022 */

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavBarMenu extends AbstractUIObject {

    @FindBy(xpath = "//a[@class='signup-icon no-margin-right']")
    private ExtendedWebElement buttonSignUp;

    @FindBy(xpath = "//a[@id='login-active']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[@id='login-active']")
    private ExtendedWebElement profileButton;

    public NavBarMenu(WebDriver driver) {
        super(driver);
    }

    public NavBarMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignUpPage clickSignUpButton(){
        buttonSignUp.click();
        return new SignUpPage(driver);
    }

    public LoginComponent openLoginForm(){
        loginButton.click();
        return new LoginComponent(driver);
    }

    public AccountPage openAccountPage(){
        profileButton.click();
        return new AccountPage(driver);
    }
}
