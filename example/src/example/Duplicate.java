package example;



public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "aravinddd";
		int[] charcount = new int[256];
		char[] array = word.toCharArray();
		for(char i : array)
		{
			charcount[i]++; 
		}
		for(int j=0;j<charcount.length;j++ )
		{
			if(charcount[j]>1)
				System.out.println((char)(j)+":"+charcount[j]);
		}

	}

}
