package week3.day2;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Attributes {
	@Test(alwaysRun = true, enabled = false)
	public void walk() {
		System.out.println("walking");
	}
//	@Test()
	public void sleep() {
		System.out.println("sleeping");
	}
//	@Test()
	public void run() {
		System.out.println("running");
		throw new NoSuchElementException("element not found");
	}


}