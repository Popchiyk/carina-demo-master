package com.qaprosoft.carina.demo.gui.pages;/*
com.qaprosoft.carina.demo.gui.pages
carina-demo-master
Popchiyk
24.06.2022 06 16:31 2022 */

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.LoginComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ForgotPage extends AbstractPage {

    @FindBy(xpath = "//form[@id='frmForgot']//input[@id='email']")
    private ExtendedWebElement emailTextField;

    @FindBy(xpath = "//form[@id='frmForgot']//input[@id='nick-submit']")
    private ExtendedWebElement forgotButton;

    public ForgotPage(WebDriver driver) {
        super(driver);
        setPageURL("/forgot.php3");
    }

    public boolean isEmailFieldPresent() {
        return emailTextField.isElementPresent();
    }

    public boolean isForgotButtonPresent() {
        return forgotButton.isElementPresent();
    }

    public ForgotPage typeEmail(String email){
        emailTextField.type(email);
        return this;
    }

    public void clickForgotButton() {
        forgotButton.click();
    }

    public ForgotPage submitForgotPassword(String email) {
        typeEmail(email);
        clickForgotButton();
        return new ForgotPage(driver);
    }

}
