package week1.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

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
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementById("createContactForm_preferredCurrencyUomId").sendKeys("AFA - Afghani");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Options option = driver.manage();
		Window window = option.window();
		window.maximize();*/
			
	}

}









