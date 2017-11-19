package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage{
	
	 @FindBy(xpath = "//div[@id='userbar']//div[@class='auth-bar__item auth-bar__item--text']")
	    private ExtendedWebElement openloginPage;


	public HomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://www.onliner.by");
	}
	
	
	public ExtendedWebElement getLogin() {
        return openloginPage;
    }

    public  void clickLoginButton(){
    	getLogin().click();
        new LoginPage(getDriver());
    }

}
