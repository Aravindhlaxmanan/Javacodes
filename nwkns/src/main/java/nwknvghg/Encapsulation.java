package nwknvghg;

class details
{
	private int marks;
	private String name;
	
	public int getmark()
	{
		return marks;
	}
	public void setmark(int a) 
	{
		marks =a;
	}
	public String getname()
	{
		
		return name;
	}
	public void setname(String a) 
	{
		name =a;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		details obj = new details();
		obj.setmark(30);
		obj.setname("aravindh");
		
		System.out.println(obj.getmark()+":"+obj.getname());
		
		

	}

}
