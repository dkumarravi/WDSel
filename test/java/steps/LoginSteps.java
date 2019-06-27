package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.PreAndPost;

public class LoginSteps extends PreAndPost{
	
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
