package nwknvghg;

class Demo
{
	String mobilename;
	int amount;
	static String phonetype;// instance of variable 
	
	public void show()
	{
		System.out.println(mobilename + ":" + amount + ":" + phonetype);	
		// variable declared in method called as object variable 
	}
	
	public void show2()
	{
		
		System.out.println(mobilename + ":" + amount + ":" + phonetype);	
	}
	//We cannot use non static instanence variable in a static method,
	public static void show1(Demo obj)
	{
		System.out.println(obj.mobilename + ":" + obj.amount + ":" + phonetype);
	}
	
}

public class Static_method_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj1 = new Demo();
		obj1.amount=10000;
		obj1.mobilename="appple";
		Demo.phonetype="Smartphone";
		Demo.phonetype="iphone";
		
		Demo obj2 = new Demo();
		obj2.amount=10000;
		obj2.mobilename="food";
		
		//Non-static show method is called by creating a instatnce for that classs
		
		obj1.show();
		
		//Static method is called directly using class 
		Demo.show1(obj2);
		
		
		

	}

}
