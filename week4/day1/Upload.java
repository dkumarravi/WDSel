package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
	ChromeDriver dr = new ChromeDriver();
	dr.get("https://www.naukri.com/");
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dr.findElementByXPath("//input[@type='file']").sendKeys("K:\\Advanced-java.pdf");
	

	}

}
