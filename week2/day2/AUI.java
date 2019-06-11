package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI {

	public static ChromeDriver driver;
	static int i=0;
	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Wait for the specified time then through the NoSuchElementException
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement elec = driver.findElementByXPath("//span[text()='Electronics']");
		// create an object to interact with AUI
		Actions builder = new Actions(driver);
		//  mouse hover on electronics -> .perform() is mandatory for all actions
		builder.moveToElement(elec).perform();
		// Another way to load URL
		driver.navigate().to("http://leafground.com/pages/drop.html");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		// to do drag and drop
		builder.dragAndDrop(src, dst).perform();
		// Selectable
		builder
		.clickAndHold(dst)
		.clickAndHold(dst)
		.clickAndHold(dst)
		.perform();

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
