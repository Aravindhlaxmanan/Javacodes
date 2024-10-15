package nwkns;

@FunctionalInterface
interface donkey
{
	int think(int i, int j);

}

public class Lambda_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		donkey obj = ( i,  j) ->  i+j;
				  
			  // when we are returning a value we should not use return keyword
			
			int rank = obj.think(4, 5);
			System.out.println(rank);
		

	}

}
