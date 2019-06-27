package com.testleaf.leaftaps.pages;

import com.autoBot.testng.api.base.Annotations;

public class LoginPage extends Annotations{
	
	public LoginPage() {}

	public LoginPage enterUserName(String un) {
		clearAndType(locateElement("id", "username"), 
				un);
		return this;
	}
	public LoginPage enterPassword(String pwd) {
		clearAndType(locateElement("id", "password"), pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage();
	}
	
	
}
