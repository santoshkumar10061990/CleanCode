package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.automation.util.AutomationUtil;

public class StartPage {

    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement butt0n;

    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(AutomationUtil.getURL());
    }

    public SignInPage invokeSignIn() {
        butt0n.click();
        return new SignInPage(driver);
    }
}
