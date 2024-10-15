package example;

public class sceondnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {34,64,76,23,65,76};
		int secondlargestnumber = findsecondlargest(numbers);
		System.out.println(secondlargestnumber);
		
		

	}


	public static int findsecondlargest(int array[])
	{
		if(array==null && array.length<2)
		{
			 throw new IllegalArgumentException("There is no second largest number in the array");
		}
		
		int firstlargenumber = Integer.MIN_VALUE;
		int secondlargenumber = Integer.MIN_VALUE;
		
		for(int i : array)
		{
			if(i>firstlargenumber)
			{
				
				secondlargenumber = firstlargenumber;
				firstlargenumber = i;
			}
			else if(i>secondlargenumber && i!=firstlargenumber)
			{
				secondlargenumber=i;
			}			
			
		}
		
		return secondlargenumber;
	}


	


	private static Exception exception(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
