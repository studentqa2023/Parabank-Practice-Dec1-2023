package com.stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	MasterPageFactory mpf;
	WebDriverWait wait;
	@Given("open the browser")
	public void open_the_browser() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getFirefoxDriver(driver);
	    
	}

	@Given("pass the URL {string} to the homepage")
	public void pass_the_url_to_the_homepage(String URL) {
	    
	    driver.navigate().to(URL);
	}

	@When("click on Sign In on the homepage")
	public void click_on_sign_in_on_the_homepage() {
	    mpf = new MasterPageFactory(driver);
	    mpf.getSigninbtnHomePage().click();
	}

	@When("enter email {string} in the Email field")
	public void enter_email_in_the_email_field(String email) {
		mpf = new MasterPageFactory(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginbtnPB()));
	    mpf.getUsername().sendKeys(email);
	}

	@When("enter password {string} in the Password field")
	public void enter_password_in_the_password_field(String password) {
	    
	    mpf.getPassword().sendKeys(password);
	}

	@When("click on Sign In")
	public void click_on_sign_in() {
		
	    mpf.getLoginbtnPB().click();
	}

	@Then("validate sign in is successful")
	public void validate_sign_in_is_successful() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogoutbtnPB()));
	    Assert.assertTrue(mpf.getLogoutbtnPB().isDisplayed(), "Sign in successful");
	}
	
	@When("click on Log Out")
	public void click_on_log_out() {
	    
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogoutbtnPB()));
	    mpf.getLogoutbtnPB().click();
	}

	@Then("validate Logout is successful")
	public void validate_logout_is_successful() {
	    
	    Assert.assertTrue(mpf.getLoginbtnPB().isDisplayed(), "Logout successful!");
	}

}
