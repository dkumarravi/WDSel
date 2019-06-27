package com.testleaf.leaftaps.pages;

import com.autoBot.testng.api.base.Annotations;

public class HomePage extends Annotations{
	
	public HomePage() {}

	public HomePage clickCrmsfa() {
		click(locateElement("link", "CRM/SFA"));
		return this;
	}
	public void printTitle() {
	
		
	}
	
	
}
