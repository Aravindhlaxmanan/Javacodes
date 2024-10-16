package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;



//Before in ascending order(0,1,2)
//After in descending order (2,1,0)

public class cucumberhooks {
	@Before(order=0)
	public static void beforerun()
	{
		System.out.println("beforefirst");
	}
	@Before(order=1)
	public static void beforerun2()
	{
		System.out.println("beforesecond");
	}
	@After(order=1)
	public static void afterrun()
	{
		System.out.println("afterfirst");
	}
	@After(order=0)
	public static void afterrun2()
	{
		System.out.println("aftersecond");
	}

}
