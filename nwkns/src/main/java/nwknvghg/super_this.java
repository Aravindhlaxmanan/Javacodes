package nwknvghg;

// Super Keyword will call the superclass constructor and it is implicitly created without mentioning



class A
{
	public A()
	{
		super();
		System.out.println("in a");
	}
	public A(int n)
	{
		super();
		System.out.println("in int a");
	}
	
}

class B extends A
{
	public B()
	{
		//super();
		super(5); // to call super class para cons we have declare super keyword method with value
		System.out.println("in b");
	}
	public B(int n)
	{
		//super(); // for call super class def cons
		//super(n); // to call super class para cons we have declare super keyword method with value
		this();// this will call constructor of same class and that will call default or para based on parameter passed.
		System.out.println("in int b");
	}
}

public class super_this {

	public static void main(String[] args) {
		
		//B obj1 = new B(); // it will call B default constructor and that will call A def con
		//B obj1= new B(6); // it will call B para const and that will call A def cons
		B obj1= new B(5);
		

	}

}
