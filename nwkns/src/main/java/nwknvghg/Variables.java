package nwknvghg;

public class Variables {
	 public static int staticVariable = 10; /// class variable
	 
	 public int instanceVariable = 20; /// instance variable
	 
	 public void myMethod() {
	        int localVariable = 30; // Local variable
	        System.out.println(localVariable); // Accessing local variable
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Variables.staticVariable); 
		 
		 
		 Variables obj = new Variables();
	        System.out.println(obj.instanceVariable);
	        
	        obj.myMethod();
		

	}

}
