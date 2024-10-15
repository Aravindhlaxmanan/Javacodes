package nwknvghg;


// Method overloading is having methods with same name with different parameters or
										   //same name with different parameter types.

class performers {
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
	
}

public class Method_overloading {
	public static void main(String[] args)
	{
		
		performers obj = new performers();
		
		int result1 = obj.add(1, 1);
		int result2 = obj.add(2, result1, 3);
		double result3 = obj.add(4.5, 2);
		
	}

}
