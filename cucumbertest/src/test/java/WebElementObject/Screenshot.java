package WebElementObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.google.common.io.Files;

public class Screenshot {

	public static void Capturescreenshot(WebDriver driver, String name) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\aravindhl\\eclipse-workspace\\cucumbertest\\Result\\"+name+".png"));
		
	}



}
