package nwknvghg;

class Calc
{
	public int add(int n1, int n2)
	{
		int result = n1+n2;
		return result;
	}
}

class advcalc extends Calc
{
	public int add(int n1, int n2)
	{
		int result = n1+n2+1;
		return result;
	}
}

// Method overriding will call the method of the object created class even if it extends
//class with same method name.

// p obj = new c --- correct
// c obj - new p ---wrong , becaues parent will not have all the properties and methods of child

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		advcalc obj = new advcalc();
		int result = obj.add(3, 4);
		System.out.println(result);
		

	}

}
