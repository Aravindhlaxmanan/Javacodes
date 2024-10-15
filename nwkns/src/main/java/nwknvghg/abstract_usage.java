package nwknvghg;

abstract class car
{
	//declaration
	public abstract void drive();
	public abstract void fly();
	
	//defining
	public void playmusic()
	{
		System.out.println("playingmusic");
		
	}
	
	//abstract class can have abstract and non abstract methods and both
	//but abstract method needs abstract class
}

abstract class lambo extends car 
{
	public void drive()
	{
		System.out.println("driving");	
	}
}

class updatedlambo extends lambo         // Concrete class
{
	public void fly()
	{
		System.out.println("driving");	
	}
}

public class abstract_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car obj = new car();// error coming because  we cant create object for abstract class
		//car obj = new lambo();
		car obj = new updatedlambo();
		obj.drive();
		obj.playmusic();
		

	}

}
