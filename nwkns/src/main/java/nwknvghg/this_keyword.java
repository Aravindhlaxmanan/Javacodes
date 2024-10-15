package nwknvghg;

class usage_this
{
	private int marks;
	private String name;
	
	public int getmark()
	{
		return marks;
	}
	public void setmark(int marks) 
	{
		this.marks =marks;
	}
	public String getname()
	{
		
		return name;
	}
	public void setname(String name) 
	{
		this.name =name;
	}
	
	
}

public class this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		usage_this obj = new usage_this();
		obj.setmark(30);
		obj.setname("aravindh");
		
		System.out.println(obj.getmark()+":"+obj.getname());
		
		

	}

}
