package testng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterzization {
	@Test
	@Parameters({"DOG","times"})
	public void example(String action, String time)
	{
		System.out.println("Dog is "+ action + time + "times");
	
	}
	
	@Test
	@Parameters({"CAT","times"})
	public void catexample(String action, String time)
	{
		
		System.out.println("cat is "+ action + time + "times");
	}
	
//	public void tryhvh()
//	{
//		System.out.println("Dog is  times");
//	}


}
