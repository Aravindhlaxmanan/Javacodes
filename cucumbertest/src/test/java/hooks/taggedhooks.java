package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class taggedhooks {
	
	@Before()
	public static void beforerun()
	{
		System.out.println("before");
	}
	
	@After()
	public static void afterrun()
	{
		System.out.println("after");
	}
	
	@Before("@Firsthook")
	public static void firsthookbeforerun()
	{
		System.out.println("hookbeforefirst");
	}
	
	@After("@Firsthook")
	public static void firsthookafterrun()
	{
		System.out.println("hookafterfirst");
	}
	
	@Before("@Firsthook,@secondhook")
	public static void hookbeforerun()
	{
		System.out.println("hookbeforefirstandsecond");
	}
	
	@After("@Firsthook,@secondhook")
	public static void hookafterrun()
	{
		System.out.println("hookafterfirstandsceond");
	}

}
