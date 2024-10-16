package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\aravindhl\\eclipse-workspace\\cucumbertest\\src\\test\\resources\\Feature",
		glue = {"Stepdefinition", "hooks"},
		tags = "@hooks",
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-reports.html",}, monochrome = true
		
		)


public class Runnerclass {

}
