package com.epam.automation.pages;

import com.epam.automation.model.HomePage;
import com.epam.automation.model.User;
import com.epam.automation.util.AutomationUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(id = "login_field")
    private WebElement input1;

    @FindBy(id = "password")
    private WebElement input2;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement buttonSubmit;

    private WebDriver mDriver;

    public SignInPage(WebDriver mDriver) {
        this.mDriver = mDriver;
        PageFactory.initElements(mDriver, this);
    }

    public HomePage signIn(String username, String password){
        input1.sendKeys(username);
        input2.sendKeys(password);
        buttonSubmit.click();
        return new HomePage(mDriver);
    }

    public boolean isReadyToSignIn() throws Exception {
        if (buttonSubmit.isDisplayed()){
            return true;
        }
        else {
            throw new Exception();
        }
    }

    public HomePage signIn(User user){
        return this.signIn(user.getUsername(), user.getPassword());
    }

}
