package testng;

import org.testng.annotations.Test;

public class Testgrouping {
	@Test(groups= {"name"})
	public void name1()
	{
		System.out.println("name1-arta");
	}
	@Test(groups= {"name"})
	public void name2()
	{
		System.out.println("name2-geeta");
	}
	@Test(groups= {"group"})
	public void group1()
	{
		System.out.println("group1-csc");
	}
	@Test(groups= {"group"})
	public void group2()
	{
		System.out.println("group2-eee");
	}
}
