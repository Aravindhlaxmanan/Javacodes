package nwknvghg;

class Atlus
{
	public void show()
	{
		System.out.println("in show");
	}
}

class Biscuit extends Atlus
{
	public void show()
	{
		System.out.println("print");
	}
}

public class Anonymous_innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atlus obj = new Atlus();
		obj.show();///--- will execute in A class
		
		Biscuit obj1 = new Biscuit();
		obj1.show();///- will execute in B class
		
		Atlus obj2 = new Biscuit();
		obj2.show();///- will execute in B class
		
		Atlus obj4 = new Atlus()
		{
			public void show()///-- this act as a new inner class , so when we try to execute show method this will get executed
			{
				System.out.println("in new show");
			}

		};
		obj4.show();
		
		

	}

}
