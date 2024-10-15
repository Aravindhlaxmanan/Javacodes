package execution;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\balakumar\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Features",
		glue = {"StepDefination"},
		tags = "@Openandclosethebrowser",
		dryRun = false, 
		plugin = {"pretty"}, monochrome = true
		
		)

public class Runner {

}
