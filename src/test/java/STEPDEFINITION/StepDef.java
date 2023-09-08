package STEPDEFINITION;

import org.openqa.selenium.chrome.ChromeDriver;

import PAGEOBJECT.AdminPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BASECLASS {

		@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
			
			driver=new ChromeDriver();
			ad=new AdminPage(driver);
	    
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	    
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		ad.SetUsername(email);
		ad.Setpassword(password);
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		ad.clickOnLogin();
	    
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	    
	}

	
}
