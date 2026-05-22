package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.LoginPageSwagLabs;
import pageObjects.MyAccountPage;


public class SwagLabsLoginSteps {
	
	WebDriver driver;
	LoginPageSwagLabs sl;
	
	
	 List<HashMap<String, String>> datamap; //Data driven
	
	
	@Given("the user navigates to swag login page")
    public void user_navigate_to_swag_login_page() {
}
	
	@When("user enters the username as {string} and password as {string}")
	public void user_enters_the_username_as_and_password_as(String user, String pwd) {
		sl=new LoginPageSwagLabs(BaseClass.getDriver());
		sl.setUsername(user);
		sl.setPassword(pwd);
	}
	@When("the user clicks on the Login swag button")
    public void click_on_login_swag_button() {
		sl=new LoginPageSwagLabs(BaseClass.getDriver());
		sl.clickswaglogin();
	}
	@Then("the user should be redirected to the SwagLabs Page")
	public void the_user_should_be_redirected_to_the_swag_labs_page() {
		
		String pageTitle = BaseClass.getDriver().getTitle();
		Assert.assertEquals("Page title does not match!", "Swag Labs", pageTitle);	
	    
}
}

