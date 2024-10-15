package seleniumexample;

class construct
{
	public construct()
	{
		System.out.println("default");
	}
	public construct(int a , int b)
	{
		System.out.println("Parameterized :" + a + b);
	}
}

public class Accesschrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//construct obj = new construct();
		construct obj1 = new construct(3,4);
				

	}

}
