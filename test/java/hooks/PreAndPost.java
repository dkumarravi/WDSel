package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPost {
	public static ChromeDriver driver;
	
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	

}
