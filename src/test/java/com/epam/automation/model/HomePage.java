package com.epam.automation.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.automation.util.AutomationUtil;

public class HomePage {

	@FindBy(xpath = "//button[@aria-label='Switch account context']/span")
	private WebElement linkLoggedInUser;

	private final WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getLoggedInUserName() {
		return linkLoggedInUser.getText();
	}

	public boolean hasUserLoggedIn() {
		return (!linkLoggedInUser.getText().equals(""));
	}
}
