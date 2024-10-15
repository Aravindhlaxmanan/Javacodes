package nwknvghg;

// Final keyword can be used at variable,method and class level
// variable- It cant override the variable 
//method - It cant override the method while doing method overriding
//class - It cant be inherited when the class is declared as final



 class Ak
{
	
	
	 public void show()
	{
		final int n=6;
		//n=7;
		System.out.println("Aravind" + n);
	}
}

class Basket extends Ak
{
	public void show()
	{
		System.out.println("Basket");
	}
}

public class Final_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
