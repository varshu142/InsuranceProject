package com.Insurance.TestCases;

import com.Insurance.Base.BaseClass;
import com.Insurance.WebPages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    LoginPage lp;

    @Test(priority = 0)
    public void enterEmailTest(){
        lp = new LoginPage();
        lp.enterEmail();
    }
    @Test(priority = 1)
    public void enterPasswordTest(){
        lp.enterPassword();
    }
    @Test(priority = 2)
    public void clickLoginButtonTest(){
        lp.clickLoginButton();
    }
    @Test(priority = 3)
    public void clickLogOutButtonTest(){
        lp.clickLogOutButton();
    }

}
