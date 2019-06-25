/*package anotherSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CL {
	ChromeDriver driver;
	@Given("Start application")
	public void startApplication() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("Enter the username as Demosalesmanager")
	public void enterTheUsernameAsDemosalesmanager() {
	  driver.findElementById("username").sendKeys("demosalesmanager");
	}
	@Given("Enter the username as DemoCSR")
	public void enterTheUsernameAsDemocsr() {
	  driver.findElementById("username").sendKeys("DemoCSR");
	}


	@Given("Enter the password as crmsfa")
	public void enterThePasswordAsCrmsfa() {
		  driver.findElementById("password").sendKeys("crmsfa");

	}

	@When("I click on the login button")
	public void iClickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("verify login is success")
	public void verifyLoginIsSuccess() {
	    System.out.println("success");
	}
	
	

}
*/