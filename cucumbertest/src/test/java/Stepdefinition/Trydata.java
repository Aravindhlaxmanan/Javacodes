package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Trydata {
	
	WebDriver driver = null;
	@Given("I want to login exact firefox driver")
	public void i_want_to_login_exact_firefox_driver() {
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		System.out.println("one");
	}
	@Given("I open exact orangehrm website  {string}")
	public void i_open_exact_orangehrm_website(String string) {
		
		driver.get(string);
		System.out.println("two");
	    
	}
	@When("I login with {string} and {string}")
	public void i_login_with_and(String string, String string2) {
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		
		System.out.println("three");
	  
	}




}
