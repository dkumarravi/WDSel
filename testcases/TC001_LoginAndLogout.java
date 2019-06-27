package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.testng.api.base.Annotations;
import com.testleaf.leaftaps.pages.LoginPage;

public class TC001_LoginAndLogout extends Annotations{
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
		testcaseName = "Login";
		testcaseDec = "Positive login steps";
		author = "Balaji";
		category =  "Smoke";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String un , String pwd) {
		
		new LoginPage()
		.enterUserName(un)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.printTitle();
		
	}




	/*Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();*/
	/*LoginPage lp = new LoginPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);*/













}
	
	/*@BeforeTest
	public void setData() {
		testcaseName = "TC001_LoginAndLogout";
		testcaseDec = "Login into leaftaps";
		author = "koushik";
		category = "smoke";
		excelFileName = "TC001";
	} 

	@Test(dataProvider="fetchData") 
	public void loginAndLogout(String data[]) {
		clearAndType(locateElement("id", "username"),data[0]);
		clearAndType(locateElement("id", "password"),data[1]);
		click(locateElement("class", "decorativeSubmit"));
		
	}
	*/






