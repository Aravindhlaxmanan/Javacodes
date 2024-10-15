package nwknvghg;

class Jokes {  // -- we cant declare outer class as static only inner class we can declare
	public void playmusic()
	{
		System.out.println("playingmusic");
		
	}
	
	class fun 
	//static class fun -- // if we mentioned class as static we dont need to create object
	{
		public void singing()
		{
			System.out.println("singing");
			
		}
	}
}



public class Inner_class {

	public static void main(String[] args) {
		
		Jokes obj = new Jokes();
		obj.playmusic();
		
		Jokes.fun obj1 =  obj.new fun();// we created obj to access class jokes so we are using that to access class fun 
										//we need obj because it is a non static method
		
		//Jokes.fun obj1= new Jokes.fun();----- for static declaration
		

	}

}
