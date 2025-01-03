package nwknvghg;

class AKAY
{
	public void show1()
	{
		System.out.println("in A");
	}
}

class Base extends AKAY
{
	public void show2()
	{
		System.out.println("in b");
	}

}

public class down_up_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AKAY obj = new Base();  // upcasting
		obj.show1();
		
		((Base) obj).show2();  // downcasting
		
		Base obj1 = (Base) obj;// downcasting
		obj1.show2();
		obj1.show1();
		
		//(Ball)obj: This is a casting operation. 
		//Here, obj is originally of type Aravind, but by enclosing (Ball) before obj, 
		//you are explicitly telling Java to treat obj as if it were a Ball object. This is called downcasting

	}

}

//When you perform Aravind obj = new Ball();, 
//you're creating an object of class Ball, but you're referencing it with a variable of type Aravind.
//While Java allows you to assign a subclass object to a superclass reference variable (upcasting), 
//you can only access methods and fields that are defined in the superclass through that reference.


