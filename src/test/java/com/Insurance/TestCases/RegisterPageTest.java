package com.Insurance.TestCases;

import com.Insurance.Base.BaseClass;
import com.Insurance.WebPages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseClass {

    RegisterPage rp;

    @Test(priority = 0)
    public void registerTest(){
        rp = new RegisterPage();
        rp.clickRegisterButton();

    }
    @Test(priority = 1)
    public void selectTitleTest(){
        rp = new RegisterPage();
        rp.selectTitle();
        rp.enterFirstName();
        rp.enterSurName();
        rp.enterPhone();
    }
    @Test(priority = 2)
    public void enterFirstNameTest() {
        rp = new RegisterPage();
        rp.enterFirstName();
    }
    @Test(priority = 3)
    public void enterSurNameTest(){
        rp = new RegisterPage();
        rp.enterSurName();
    }
    @Test(priority = 4)
    public void enterPhoneTest(){
        rp = new RegisterPage();
        rp.enterPhone();
    }
    @Test(priority = 5)
    public void selectYearOfBirthTest(){
        rp = new RegisterPage();
        rp.selectYearOfBirth();
    }
    @Test(priority = 6)
    public void selectMonthOfBirthTest(){
        rp = new RegisterPage();
        rp.selectMonthOfBirth();
    }
    @Test(priority = 7)
    public void selectDateOfBirthTest(){
        rp = new RegisterPage();
        rp.selectDateOfBirth();
    }
    @Test(priority = 8)
    public void selectLicenceTypeTest(){
        rp = new RegisterPage();
        rp.selectLicenceType();
    }
    @Test(priority = 9)
    public void selectLicencePeriodTest(){
        rp = new RegisterPage();
        rp.selectLicencePeriod();
    }
    @Test(priority = 10)
    public void selectOccupationTest(){
        rp = new RegisterPage();
        rp.selectOccupation();
    }
    @Test(priority = 11)
    public void enterAddressStreetTest(){
        rp = new RegisterPage();
        rp.enterAddressStreet();
    }
    @Test(priority = 12)
    public void enterCityTest(){
        rp = new RegisterPage();
        rp.enterCity();
    }
    @Test(priority = 13)
    public void enterCountryTest(){
        rp = new RegisterPage();
        rp.enterCountry();
    }
    @Test(priority = 14)
    public void enterPostCodeTest(){
        rp = new RegisterPage();
        rp.enterPostCode();
    }
    @Test(priority = 15)
    public void enterEmailTest(){
        rp = new RegisterPage();
        rp.enterEmail();
    }
    @Test(priority = 16)
    public void enterPasswordTest(){
        rp = new RegisterPage();
        rp.enterPassword();
    }
    @Test(priority = 17)
    public void enterConfirmPasswordTest(){
        rp = new RegisterPage();
        rp.enterConfirmPassword();
    }
    @Test(priority = 18)
    public void clickCreateButtonTest(){
        rp = new RegisterPage();
        rp.clickCreateButton();
    }



}
