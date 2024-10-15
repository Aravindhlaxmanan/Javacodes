package nwknvghg;

@FunctionalInterface 
interface dance //// only one method should be declared inside , so that only lambda function will work.
{
	void baley(int i);
	
	
	
}

public class Lambda_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		dance obj = new dance()  //We cannot directly instantiate interface but we can define the method 
								 //inside like anonymous inner class
			{
			  public void baley(int i)
			  {
				  System.out.println("normal lambda dancing baley");
			  }
			  
			};
			obj.baley(5);
			
		dance obj1 = (i)  ->	 System.out.println("i"+ i);	
		// this will work when only one method is declared in interface
				
				
								  // we know that new keyword will allocate memory for the object which initialized
								  // by the constructor, so we can cut out the new and method part here.
		obj1.baley(2);	 
				
		
		
	
			
		
		

	}

}
