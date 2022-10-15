package com.Insurance.WebPages;

import com.Insurance.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class RegisterPage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//a[text()='Register']")
    WebElement registerButton;
    @FindBy(how = How.XPATH, using = "//h1")
    WebElement header;
    @FindBy(how = How.XPATH, using = "//a[@href=\"index.php\"]")
    WebElement loginButton;
    @FindBy(how = How.ID, using = "user_title")
    WebElement title;
    @FindBy(how = How.ID, using = "user_firstname")
    WebElement firstName;
    @FindBy(how=How.ID,using = "user_surname")
    WebElement surName;
    @FindBy(how=How.ID, using = "user_phone")
    WebElement phoneNumber;
    @FindBy(how=How.NAME,using = "year")
    WebElement yearOfBirth;
    @FindBy(how=How.NAME, using = "month")
    WebElement monthOfBirth;
    @FindBy(how = How.NAME, using = "date")
    WebElement dateOfBirth;
    @FindBy(how = How.XPATH,using = "//label[text()='Full']")
    WebElement licenceType;
    @FindBy(how = How.NAME, using = "licenceperiod")
    WebElement licencePeriod;
    @FindBy(how = How.ID, using = "user_occupation_id")
    WebElement occupation;
    @FindBy(how = How.XPATH, using = "//input[@name=\"street\"]")
    WebElement addressStreet;
    @FindBy(how = How.XPATH,using = "//input[@name=\"city\"]")
    WebElement city;
    @FindBy(how = How.XPATH, using = "//input[@name=\"county\"]")
    WebElement country;
    @FindBy(how = How.XPATH, using = "//input[@name=\"post_code\"]")
    WebElement postCode;
    @FindBy(how = How.XPATH, using = "//input[@name=\"email\"]")
    WebElement email;
    @FindBy(how = How.XPATH, using = "//input[@name=\"password\"]")
    WebElement password;
    @FindBy(how = How.XPATH, using = "//input[@name=\"c_password\"]")
    WebElement confirmPassword;
    @FindBy(how = How.XPATH, using = "//input[@name=\"submit\"]")
    WebElement createButton;
    @FindBy(how = How.XPATH, using = "//h3")
    WebElement loginHeader;



    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickRegisterButton(){

        registerButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("register.php"));
        String text = header.getText();
        Assert.assertEquals(text,"Sign up as a new user");
        Assert.assertTrue(loginButton.isDisplayed());
    }

    public void selectTitle(){
        title.click();
        Select titleDropDown = new Select(title);
        titleDropDown.selectByValue("Miss");
    }

    public void enterFirstName(){
        firstName.sendKeys("Krishiv");

    }
    public void enterSurName(){
        surName.sendKeys("Patel");

    }
    public void enterPhone() {
        phoneNumber.sendKeys("2042042040");
    }
    public void selectYearOfBirth(){
        yearOfBirth.click();
        Select year = new Select(yearOfBirth);
        year.selectByValue("1947");

    }
    public void selectMonthOfBirth(){
        monthOfBirth.click();
        Select month = new Select(monthOfBirth);
        month.selectByValue("2");

    }
    public void selectDateOfBirth(){
        dateOfBirth.click();
        Select date = new Select(dateOfBirth);
        date.selectByValue("14");

    }
    public void selectLicenceType(){
        licenceType.click();

    }
    public void selectLicencePeriod(){
        licencePeriod.click();
        Select licencePeriodOption = new Select(licencePeriod);
        licencePeriodOption.selectByValue("4");

    }
    public void selectOccupation(){
        occupation.click();
        Select occupationOption = new Select(occupation);
        occupationOption.selectByValue("6");
    }
    public void enterAddressStreet(){
        addressStreet.sendKeys("Prevette Street");
    }
    public void enterCity(){
        city.sendKeys("Winnipeg");
    }
    public void enterCountry(){
        country.sendKeys("Canada");
    }
    public void enterPostCode(){
        postCode.sendKeys("R2K3E3");
    }
    public void enterEmail(){
        email.sendKeys("krish12@gmail.com");
    }
    public void enterPassword(){
        password.sendKeys("khp12345");
    }
    public void enterConfirmPassword(){
        confirmPassword.sendKeys("khp12345");
    }
    public void clickCreateButton() {
        createButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
        String text = loginHeader.getText();
        Assert.assertEquals(text, "Login");
    }


}
