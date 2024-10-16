package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testsuite {
	
	@BeforeSuite
	public static void beforesuite()
	{
		System.out.println("before");
	}
	@Test( groups= {"name"})
	public void firstsuite()
	{
		System.out.println("Firstsuite");
	}
	
	@Test(dependsOnMethods="firstsuite")
	public void secondsuite()
	{
		System.out.println("secondsuite");
	}

	
	@Test(dependsOnMethods="secondsuite")
	public void thirdsuite()
	{
		System.out.println("thirdsuite");
	}
	@AfterSuite()
	public static void AfterSuite()
	{
		System.out.println("AfterSuite");
	}

}
