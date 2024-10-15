package nwknvghg;

class AravindException extends Exception
{
// This is Run time exception constructor which is created to show the message of constructor
	public AravindException(String string) { 
		
		super(string);
	}
	
}

public class Throw_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=2;
		int j=4;
		
	
		try
		{
			int k = i/j;
			System.out.println(k);
			if(k==0)
				//throw new ArithmeticException();  //calling airthmetic exception by creating object for that classs
				//throw new AravindExeception("original value is printed"); // like method calling
			throw new AravindException("original value is printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("value cannot be zero " + e);
		} 
		catch (AravindException e) {
			// TODO Auto-generated catch block
			int k = 2/1;
			System.out.println("Correct value " + k + e);
		}
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			int k = 2/1;
//			System.out.println("Correct value " + k + e);
//		}
//		
		
		

	}

}
