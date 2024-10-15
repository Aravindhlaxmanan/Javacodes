package Stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import WebElementObject.Screenshot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrm {

	WebDriver driver = null;

	
	@Given("I want to login firefox")
	public void i_want_to_login_firefox() {
		// Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome");
//		ChromeOptions options = new ChromeOptions();
//		options.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
//		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
	@Given("I open the website {string}")
	public void i_open_the_website(String string) {
		driver.get(string);
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I login with username and password")
	public void i_login_with_username_and_password()throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000); 
		Screenshot.Capturescreenshot(driver, "page1");
	   
	}

	@Then("I perform some action")
	public void i_perform_some_action() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(5000); 
		
	  
	}
	
	//button[contains(text(),'Login')]

	@Then("I take some details from the page")
	public void i_take_some_details_from_the_page() throws IOException{
	    // Write code here that turns the phrase above into concrete actions
		Screenshot.Capturescreenshot(driver, "page2");
		boolean status =driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	    Assert.assertTrue(status);
	    System.out.println("status is displayed :" + status);
	}
	
	

	
}
