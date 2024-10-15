package nwknvghg;

interface  fun 
{
	 public void go();
	 public int of();
}

abstract class donkey implements fun
{
	 public abstract void goo();
	 public abstract int ofhhh();
}

class example extends donkey
{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("going in example");
		
	}

	@Override
	public int of() {
		// TODO Auto-generated method stub
		System.out.println("of in example");
		return 0;
	}

	@Override
	public void goo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ofhhh() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class think implements fun
{
	public void go()
	{
		System.out.println("going in think class");
	}
	public int of()
	{
		int a= 5+3;
		return a;
	
	}
	public int off()
	{
		int a= 5+4;
		return a;
	
	}
}

class yoyo extends think
{
	public void executing()
	{
	int a = off();
	System.out.println(a);
	}
}

public class interface_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		think obj1 = new think();
		yoyo obj2 = new yoyo();
		obj1.go();
		int b  =  obj1.of();
		System.out.println(b);
		obj2.executing();
		
		
		

	}

}
