package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class UserLogin extends AbstractUIObject{

	public UserLogin(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		
	}
	
	@FindBy(xpath = "//div[@class='auth-box__line']/input[@type='text']")
	 private ExtendedWebElement mail;
	
	@FindBy(xpath = "//div[@class='auth-box__line']/input[@type='password']")
	private ExtendedWebElement password;
	
	 public ExtendedWebElement getEmail() {
	        return mail;
	    }

	 public ExtendedWebElement getPassword() {
	        return password;
	    }

}
