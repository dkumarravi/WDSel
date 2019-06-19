package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends PreAndPost{
	@Test(dataProvider="dataSupplier")
	public void createLead(String cname, String fname, String lname, String contact) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();

	}
	
	@DataProvider(name="dataSupplier")
	public String[][] getData() {		
		String[][] data = new String[2][3];
		
		data[0][0]="Testleaf";
		data[0][1]="Gopi";
		data[0][2]="J";
		
		data[1][0]="Testleaf";
		data[1][1]="Balaji";
		data[1][2]="C";
		
		return data;
	
	}
	
	/*String[][] data ={ {"Testleaf", "Gopi", "J"}, 
	{"Testleaf", "Balaji", "C"}};*/
	
	
	
	
	
}






