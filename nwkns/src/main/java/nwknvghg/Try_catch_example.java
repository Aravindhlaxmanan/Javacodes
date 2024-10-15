package nwknvghg;

public class Try_catch_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=4;
		int nums[]= {1,2,3,4,5};
		
		
//If you have multiple statements in a try block and one of them fails, 
//it typically indicates that the conditions for the subsequent statements might not be met due to the failure of the preceding statement. 
//Therefore, executing those subsequent statements could lead to unpredictable behavior or further errors.
		
		try
		{
			System.out.println(i/j);
			System.out.println("trying to execute next line");
			System.out.println(nums[1]);
			System.out.println(nums[7]);
			
		}
//		catch(Exception e)   --------------- Commented this line due to this Exception is parent class
//		{
//			System.out.println("It cannot divide");
//		}
		catch(ArithmeticException e)
		{
			System.out.println("It cannot divide " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("It cannot access");
		}
		
		

	}

}
