package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	ChromeDriver driver;
	@Given("Start application")
	public void startApplication() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("Enter the username as {string}")
	public void enterTheUsernameAsDemosalesmanager(String un) {
	  driver.findElementById("username").sendKeys(un);
	}

	@Given("Enter the password as {string}")
	public void enterThePasswordAsCrmsfa(String pwd) {
		  driver.findElementById("password")
		  .sendKeys(pwd);

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
