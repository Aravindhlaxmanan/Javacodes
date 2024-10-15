package nwknvghg;

abstract class Adas
{
	public abstract void show();
	public abstract void display();
	
}



public class abstract_anonymousclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Adas obj4 = new Adas()
		{
			public void show()///-- this act as a new inner class , so when we try to execute show method this will get executed
			{
				System.out.println("in new show");
			}
			public void display()
			{
				System.out.println("in display");
			}

		};
		obj4.show();
		obj4.display();
		
		

	}

}
