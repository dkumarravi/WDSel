package com.testleaf.leaftaps.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class LoginPage extends Annotations{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	private List<WebElement> us;
	@CacheLookup
	@FindBy(how = How.ID, using = "username")
	private WebElement eleUserName;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement elePassword;
	
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement eleLoginButton;
	
	public LoginPage enterUserName(String un) {
		clearAndType(eleUserName, un);
		return this;
	}
	public LoginPage enterPassword(String pwd) {
		clearAndType(elePassword, pwd);
		return this;
	}
	public HomePage clickLogin() {
		click(eleLoginButton);
		return new HomePage();
	}
	
	
}
