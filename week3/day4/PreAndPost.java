package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.utils.ReadExcel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class PreAndPost {
	public String excelFileName;
	public ChromeDriver driver;
	@Parameters({"password","username"})
	@BeforeMethod
	public void startApp(String password, String username) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	@DataProvider(name="dataSupplier")
	public String[][] getData() throws IOException {		
		String[][] data = 
		ReadExcel.getExcelData(excelFileName);
		
		return data;
	
	}
	
	
}
