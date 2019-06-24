package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeleniumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			driver.findElementById("username").sendKeys("DemoSalesManager");
		}
		catch (NoSuchElementException e) {
		}
		catch (WebDriverException e) {
			//			System.err.println("Elemenet not found");
			e.printStackTrace();
			throw new NoSuchElementException("Element not found");
			//			System.out.println();
		}

		finally {
			driver.close();
		}
		//		driver.findElementById("password").sendKeys("crmsfa");
		sleep();
	}

	public static void sleep() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}














}
