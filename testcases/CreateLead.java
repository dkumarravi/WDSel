package org.testleaf.leaftaps.leads.testcases;

import org.testng.annotations.Test;

import week3.day2.PreAndPost;

public class CreateLead extends PreAndPost{
	@Test
	public void runCreateLead() {
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();

	}
}






