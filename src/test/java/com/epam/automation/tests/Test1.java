package com.epam.automation.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.epam.automation.model.HomePage;
import com.epam.automation.pages.SignInPage;
import com.epam.automation.pages.StartPage;
import com.epam.automation.util.AutomationUtil;

public class Test1 {

	@Test
	public void testOneCanLoginGithub() {
		AutomationUtil.loadProperties();
		final String USERNAME = AutomationUtil.getUserName();
		final String PASSWORD = AutomationUtil.getPassword();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		StartPage startPage = new StartPage(driver);
		startPage.open();
		SignInPage signInPage = startPage.invokeSignIn();
		HomePage homePage = signInPage.signIn(USERNAME, PASSWORD);
		String loggedInUserName = homePage.getLoggedInUserName();
		Assert.assertEquals(USERNAME, loggedInUserName);
		driver.quit();
	}
}
