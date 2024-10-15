package Stepdefinition;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import WebElementObject.HighLightElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition_class {

	WebDriver driver = null;

	@Given("I want to login google")
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
		driver.get("https://www.Google.com");

	}

	@Given("search something on search bar")
	public void search_something_on_search_bar() {
		// Write code here that turns the phrase above into concrete actions'

		WebElement searchedfield = driver.findElement(Searchfield);
		HighLightElement.highLighterMethod(driver, searchedfield);
		searchedfield.click();
		// searchedfield.sendKeys("reason meaning");

	}

	@When("I click search button {string}")
	public void i_click_search_button(String searchText) {
		// Write code here that turns the phrase above into concrete actions
		// Actions actions = new Actions(driver);
		WebElement searchedfield = driver.findElement(Searchfield);
		searchedfield.sendKeys(searchText + Keys.RETURN);

	}

	@Then("I take four line info")
	public void i_take_four_line_info() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement resultElement = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='O5uR6d wHYlTd'][1]")));
		// WebElement element = driver.findElement(textretreive);
		String text = resultElement.getText();
		boolean result = text.contains("extreme");
		Assert.assertTrue(result);
		System.out.println("Retrieved text: " + text);

	}

	// public static By Searchfield = By.xpath("input");
	// public static By textretreive = By.xpath("//div[@class='O5uR6d wHYlTd'][1]");
	public static By Searchfield = By.xpath("//*[@id=\"APjFqb\"]");
	public static By textretreive = By.xpath("//div[@class='O5uR6d wHYlTd']");

}
