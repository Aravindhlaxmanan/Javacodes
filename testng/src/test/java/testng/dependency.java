package testng;

import org.testng.annotations.Test;

public class dependency {
	//@Test(enabled=false) // this will not work and second method will not execute because first was false enabled.
	@Test()
	public static void first()
	{
		System.out.println("First");
	}
	
	@Test(dependsOnMethods="first")
	public static void second()
	{
		System.out.println("second");
	}

	
	@Test(dependsOnMethods="second")
	public static void third()
	{
		System.out.println("third");
	}


}
