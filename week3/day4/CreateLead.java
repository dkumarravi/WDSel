package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends PreAndPost{
	
	@BeforeClass
	public void setData() {
		excelFileName="CreateLead";
	}
	
	
	
	@Test(dataProvider="dataSupplier")
	public void createLead(String cname, String fname, String lname) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();

	}
	
	
	
	/*String[][] data ={ {"Testleaf", "Gopi", "J"}, 
	{"Testleaf", "Balaji", "C"}};*/
	
	
	
	
	
}






