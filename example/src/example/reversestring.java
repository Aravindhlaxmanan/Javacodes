package example;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Laxmana";
		char[] converted = word.toCharArray();
		int left =0;
		int right = converted.length - 1;
		while(left<right)
		{
		char temp = converted[left] ;
		converted[left] = converted[right];
		converted[right] = temp;
		
		left++;
		right--;
		}
		
		String reversedWord = new String(converted);
        System.out.println(reversedWord);

	}

}
