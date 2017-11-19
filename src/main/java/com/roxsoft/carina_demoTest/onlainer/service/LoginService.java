package com.roxsoft.carina_demoTest.onlainer.service;

import org.testng.Assert;

import com.roxsoft.carina_demoTest.onlainer.pages.HomePage;
import com.roxsoft.carina_demoTest.onlainer.pages.LoginPage;

import static com.qaprosoft.carina.core.foundation.webdriver.DriverPool.getDriver;

public class LoginService {

	public void openPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }
	
	public void clickLoginButton(){
		HomePage homePage = new HomePage(getDriver());
		homePage.clickLoginButton();
    }
	
	
	public void loginTest( String mail, String password) {
            LoginPage logPage = new LoginPage(getDriver());
            logPage.enterMail(mail);
            logPage.enterPass(password);

    }
	
	public void finishLogin(){
		LoginPage logPage = new LoginPage(getDriver());
		logPage.clickLogin();
    }
   
}
