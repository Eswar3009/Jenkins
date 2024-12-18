package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User have to enter the facebook application through chrome browser")
	public void user_have_to_enter_the_facebook_application_through_chrome_browser() {
		launch();
		toGetUrl("https://www.facebook.com/");
	}

	
	@When("User have to enter the valid username and valid password")
	public void user_have_to_enter_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		
		List<Map<String, String>> mp = d.asMaps(String.class,String.class);
		String email = mp.get(1).get("password");
		WebElement txtemail = driver.findElement(By.id("email"));
	    txtemail.sendKeys(email);
	    String password = mp.get(0).get("username");
	    WebElement txtpass = driver.findElement(By.id("pass"));
	    txtpass.sendKeys(password);
	}
	
	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
	    login.click();
	}

	@Then("User reach the valid or invalid credential page")
	public void user_reach_the_valid_or_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("User reached the invalid credential page");
		}
		else {
			System.out.println("User reached the valid credential page");
		}
	}


}
