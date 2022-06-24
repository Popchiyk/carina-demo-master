package com.qaprosoft.carina.demo.gui.pages;/*
com.qaprosoft.carina.demo.gui.pages
carina-demo-master
Popchiyk
24.06.2022 06 14:05 2022 */

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AccountPage extends AbstractPage {
    public AccountPage(WebDriver driver) {
        super(driver);
        setPageURL("/account.php3");
    }
}
