package com.Insurance.WebPages;

import com.Insurance.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BaseClass {

    @FindBy(how = How.ID, using = "email")
    WebElement email;
    @FindBy(how = How.ID, using = "password")
    WebElement password;
    @FindBy(how = How.XPATH, using = "//input[@name=\"submit\"]")
    WebElement loginButton;
    @FindBy(how = How.XPATH, using = "//h4")
    WebElement signedInAsHeader;
    @FindBy(how = How.XPATH, using = "//input[@value=\"Log out\"]")
    WebElement logOutButton;



    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void enterEmail(){
        email.sendKeys("krish12@gmail.com");
    }
    public void enterPassword(){
        password.sendKeys("khp12345");
    }
    public void clickLoginButton(){
        loginButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("header.php"));
        String text = signedInAsHeader.getText();
        Assert.assertEquals(text,"krish12@gmail.com");
    }
    public void clickLogOutButton(){
        logOutButton.click();

    }

}
