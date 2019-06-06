package week1.day4;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		//Establish connection between selenium code and driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Create object for the browser specific Class & Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//To load the url
		driver.get("http://leaftaps.com/opentaps/");
		//To maximise the browser
		driver.manage().window().maximize();
		//To find the webElement
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(source);
		//Using VisibleText
		//dd.selectByVisibleText("Employee");
		// Using Value
		//dd.selectByValue("LEAD_PARTNER");
		//Using Index
		//dd.selectByIndex(9);
		//WebElement eleSource = dd.getFirstSelectedOption();
		//System.out.println(eleSource.getText());		
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		//foreach
		//for(datatype temp : collection)
		for(WebElement option : allOptions) {
			String text = option.getText();
			if (text.endsWith("")) {				
				System.out.println(text);
			}
		}
		
		/*String text1 = "abc";
		String text2 = "ajkdsfabcljk32456";
		text1.equals(text2)
		text1.equalsIgnoreCase(text2)
		text1.contains(text2)
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Options option = driver.manage();
		Window window = option.window();
		window.maximize();*/
			
	}

}









