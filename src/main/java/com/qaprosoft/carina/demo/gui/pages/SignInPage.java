package com.qaprosoft.carina.demo.gui.pages;/*
com.qaprosoft.carina.demo.gui.pages
carina-demo-master
Popchiyk
23.06.2022 06 18:57 2022 */

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage {

    public SignInPage(WebDriver driver) {
        super(driver);
        setPageURL("/login.php3");
    }
}
