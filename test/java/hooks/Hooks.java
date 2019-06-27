package hooks;

import org.openqa.selenium.OutputType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

public class Hooks extends PreAndPost {
	
	@Before
	public void before(Scenario sc) {
		System.out.println(sc.getName());
		login();
	}
	@After
	public void after(Scenario sc) {
		if(sc.isFailed()) {
		byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshot, "image/png");
		} 
		closeBrowser();
	}
	@AfterStep
	public void afterStep(Scenario sc)
	{
		byte[] screenshot = driver
				.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshot, "image/png");
		sc.write("I m writing my own des");
	}
}