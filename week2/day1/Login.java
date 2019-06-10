package week2.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static ChromeDriver driver;
	static int i=0;
	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Wait for the specified time then through the NoSuchElementException
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		takeSnap();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		takeSnap();
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		takeSnap();
		// take snapshot
		// store as flat file
		File snapFile = driver.getScreenshotAs(OutputType.FILE);
		// create a new file 
		File dest = new File("./snaps/img.png");
		// copy the flat file to the newly created file
		FileUtils.copyFile(snapFile, dest);












	}

	public static void takeSnap() {
		File snapFile2 = driver.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./snaps/img"+i+".png");
		i++;
		try {
			FileUtils.copyFile(snapFile2, dest2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















}
