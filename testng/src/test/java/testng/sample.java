package testng;

import org.testng.annotations.Test;

public class sample {
	
	@Test(priority=0)
	public static void first()
	{
		System.out.println("First");
	}
	
	@Test(priority=2,enabled=false)
	public static void second()
	{
		System.out.println("second");
	}

	
	@Test(priority=-1)
	public static void third()
	{
		System.out.println("third");
	}


}
