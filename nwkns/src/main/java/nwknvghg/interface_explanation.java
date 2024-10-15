package nwknvghg;


//class- class ----> Extends
//class - interface ----> Implements
//interface - interface ----> extends

interface tribute
{
	int a =5;
	String name= "aravind";    // in interface we have to declare the variables and not define , if we just define it will throw error.
							   // Variables declaring inside interface are "Final" & "Static".
							   // Mostly not preferable and not associate with interface rule.
	
	void rank();
}

interface y
{
	void run();
}

interface z extends y
{
	//Method in Y 
	
}

class thanks implements z  //The type yoyo must implement the inherited abstract method y.run()
						 // Even if we are implementing z but it extends to interface Y , so need to implement method in Y.
{
	public void run() 
	{
		System.out.println("running in yoyo");
	}
}

class funk implements tribute,y // we can implement multiple interface in single class
{

	public void rank() 
	{
		System.out.println("Ranking");
	}

	public void run() 
	{
		System.out.println("running in funk");
	}
	
}

interface trying
{
	 void trying();
}

class risk implements trying
{

	@Override
	public void trying() {
		// TODO Auto-generated method stub
		
	}
	
}

public class interface_explanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		funk obj = new funk();
		obj.rank();
		obj.run();
		
		
		trying obj1 = new risk();  // interface reference
		obj1.trying();
		
		//tribute.a=5; -------//The final field tribute.a cannot be assigned , since it is final variable no need for object.
		

	}

}
