package com.roxsoft.carina_demoTest.onlainer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage{

	@FindBy(xpath = "//div[@class='auth-box__line']/input[@type='text']")
	 //private ExtendedWebElement mail;
	private UserLogin mail;
	
	@FindBy(xpath = "//div[@class='auth-box__line']/input[@type='password']")
	//private ExtendedWebElement password;
	private UserLogin password;
	
	@FindBy(xpath = "//div[@class='auth-box__line auth-box__line--final']/button[@type='submit']")  //*[@id="auth-container__forms"]/div/div[2]/form/div[3]/div[2]/button
	private ExtendedWebElement signInButton;

	
	public LoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://profile.onliner.by/login.html");
	}
	

	 /*public ExtendedWebElement getEmail() {
	        return mail;
	    }

	 public ExtendedWebElement getPassword() {
	        return password;
	    }
    
	 public void enterEmail(String email){
		 getEmail().click();
		 getEmail().type(email);
	 }
	 
	 public  void enterPass(String pass){
		 getPassword().type(pass);
	    }*/
	
	public void enterMail(String email){
		mail.getEmail().type(email);
	}
	
	public void enterPass(String pass){
		password.getPassword().type(pass);
	}

	 public ExtendedWebElement getLogin() {
	        return signInButton;
	    }
	 
	 public void clickLogin(){
		    getLogin().click();
	    }

}
