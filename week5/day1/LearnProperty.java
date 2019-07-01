package week5.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnProperty {
	@Test
	public void property() throws FileNotFoundException, IOException{

		Properties prop = new Properties();
		prop.load(new FileInputStream("English.properties"));
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id(prop.getProperty("LoginPage.userName.id")))
		.sendKeys("Demosalesmanager");
		driver.findElement(By.xpath(prop.getProperty("LoginPage.password.xpath")))
		.sendKeys("crmsfa");
		driver.findElementByClassName(
				prop.getProperty("LoginPage.loginButton.className")).click();

	}

}





