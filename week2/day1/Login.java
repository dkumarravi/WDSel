package week2.day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	@DataProvider(name= "fetch", parallel= true)
	public String[][] dataP() {
		final String[][] data = new String[4][2];
		data[0][0] = "1";
		data[0][1] = "crmsfa";
		data[1][0] = "2";
		data[1][1] = "crmsfa";
		data[2][0] = "11";
		data[2][1] = "crmsfa";
		data[3][0] = "22";
		data[3][1] = "crmsfa";
		return data;
	}
	BrowserInstances instance ;
	@BeforeMethod
	public void before() {
		instance= BrowserInstances.getInstance();
		instance.setdriver();
		instance.getDriver().get("http://leaftaps.com/opentaps/control/main");
		instance.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test(dataProvider = "fetch")
	public void main(String[] data) throws IOException, InterruptedException {
		instance.getDriver().findElement(By.id("username")).sendKeys(data[0]);
		instance.getDriver().findElement(By.id("password")).sendKeys(data[1]);
		Thread.sleep(5000);
		instance.getDriver().quit();
	}
}
