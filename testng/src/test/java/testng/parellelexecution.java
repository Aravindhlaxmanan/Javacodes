package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parellelexecution {
	WebDriver driver = null;
	
//	 @BeforeMethod
//	    public void setup() {
//	        // Initialize the WebDriver before each test method
//	        driver = new FirefoxDriver();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	        driver.manage().window().maximize();
//	    }
	@Test
	public void i_want_to_login_google() {
		// Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome");
//		ChromeOptions options = new ChromeOptions();
//		options.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
//		WebDriver driver = new ChromeDriver();
		
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.cars.com");
		

	}
	@Test
	public void loginfirefox() {
		// Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome");
//		ChromeOptions options = new ChromeOptions();
//		options.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
//		WebDriver driver = new ChromeDriver();
		
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");

	}
	
//	@AfterMethod
//	public void teardown() {
//        // Quit the WebDriver after each test method
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}
