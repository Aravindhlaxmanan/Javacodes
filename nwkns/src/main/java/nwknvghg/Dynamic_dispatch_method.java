package nwknvghg;

class Aravind
{
	public void show()
	{
		System.out.println("in A");
	}
}

class Ball extends Aravind
{
	public void show()
	{
		System.out.println("in b");
	}

}

class C extends Ball
{
	public void show()
	{
		System.out.println("in c");
	}

}

class D extends Aravind
{
	public void show1()
	{
		System.out.println("in D");
	}

}

// 
public class Dynamic_dispatch_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aravind obj1 = new Ball();// Obj type is aravind only but the object is created for class ball
		obj1.show();// so it will call show method in class b only.
		
		Aravind obj = new Aravind();
		obj.show();
		
		 obj = new Ball();// here, obj is created for ball class so it will execute that.
		obj.show();
		
		 obj = new C();
		obj.show();
		
		Aravind obj2 = new D();
		obj2.show();
		
		
		//obj reference will have a memory for class aravind but when we assign the same object to 
		//other class it wiil cut the connection with the previous class and connect with new class.
		
		
		

	}

}
