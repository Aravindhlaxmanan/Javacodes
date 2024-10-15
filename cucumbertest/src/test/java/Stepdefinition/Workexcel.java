package Stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.ExcelUtils;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Workexcel {
	WebDriver driver = null;

	List<String[]> excelData;
	int rowIndex = 1;

	public Workexcel() {
		excelData = ExcelUtils.readExcelData(
				"C:\\Users\\aravindhl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\Datasheet\\data.xlsx",
				"Sheet1");
	}

	@Given("I want to login firefox driver using exceldata")
	public void i_want_to_login_firefox_driver_using_exceldata() {
//		driver = new FirefoxDriver();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();

		System.out.println("Navigating to login page");
	}

	@Given("I open orangehrm website  {string} using exceldata")
	public void i_open_orangehrm_website_using_exceldata(String string) {
		// driver.get(string);

		System.out.println("Redirected to the dashboard");
	}

	@When("I login with using exceldata new")
	public void i_login_with_using_exceldata_new() {
		while (rowIndex < excelData.size()) {
			String username = excelData.get(rowIndex)[0];
			String password = excelData.get(rowIndex)[1];
			System.out.println("Entering credentials: " + username + " / " + password);
			rowIndex++;
		}
	}

}
