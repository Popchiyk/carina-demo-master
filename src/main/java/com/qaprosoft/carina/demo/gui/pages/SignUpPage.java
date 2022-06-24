package com.qaprosoft.carina.demo.gui.pages;/*
com.qaprosoft.carina.demo.gui.pages
carina-demo-master
Popchiyk
23.06.2022 06 16:37 2022 */

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    @FindBy(id = "uname")
    private ExtendedWebElement loginTitle;

    @FindBy(xpath = "//form[@id='frmOpin']//input[@id='email']")
    private ExtendedWebElement emailTitle;

    @FindBy(xpath = "//form[@id='frmOpin']//input[@id='upass']")
    private ExtendedWebElement passwordTitle;

    @FindBy(xpath = "//form[@id='frmOpin']//label[@for='iagree1']")
    private ExtendedWebElement checkBoxAgreeRule;

    @FindBy(xpath = "//form[@id='frmOpin']//label[@for='iagree2']")
    private ExtendedWebElement checkBoxAgreeOld;

    @FindBy(xpath = "//form[@id='frmOpin']//input[@id='nick-submit']")
    private ExtendedWebElement sighUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        setPageURL("/register.php3");
    }

    public boolean isLoginTitlePresent() {
        return loginTitle.isElementPresent();
    }

    public boolean isEmailTitlePresent() {
        return emailTitle.isElementPresent();
    }

    public boolean isPasswordTitlePresent() {
        return emailTitle.isElementPresent();
    }

    public boolean isCheckBoxAgreeRulePresent() {
        return checkBoxAgreeRule.isElementPresent();
    }

    public boolean isCheckBoxAgreeOldPresent() {
        return checkBoxAgreeOld.isElementPresent();
    }

    public boolean isSighUpButtonPresent() {
        return sighUpButton.isElementPresent();
    }

    public SignUpPage typeLogin(String login) {
        loginTitle.type(login);
        return this;
    }

    public SignUpPage typeEmail(String email) {
        emailTitle.type(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        passwordTitle.type(password);
        return this;
    }

    public void clickCheckBoxAgreeRule() {
        checkBoxAgreeRule.click();
    }

    public void clickCheckBoxAgreeOld() {
        checkBoxAgreeOld.click();
    }

    public void clickSighUpButton() {
        sighUpButton.click();
    }

    public SignUpPage signUpAccount(String login, String email, String password) {
        typeEmail(email);
        typeLogin(login);
        typePassword(password);
        clickCheckBoxAgreeRule();
        clickCheckBoxAgreeOld();
        clickSighUpButton();
        return new SignUpPage(driver);
    }
}
