package example;

import java.util.HashMap;
import java.util.Map;


public class Charrepition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letters= "hhddssj";
		findlettersrepition(letters);

	}
	
	public static void findlettersrepition(String letters)
	{
		char[] numberletters = letters.toCharArray();
		Map<Character, Integer>countersmap = new HashMap<>();
		//char[] numberletters = letters.toCharArray();
		
		
		for(char c : numberletters)
		{
			if(countersmap.containsKey(c))
			{
				countersmap.put(c, countersmap.get(c)+ 1);

			}
			else
			{
				countersmap.put(c,1);
				
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry : countersmap.entrySet())
		{
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
		
		
		
		
		
//		  Map<Character, Integer> charCountMap = new HashMap<>();
//
//	        // Convert input string to character array
//	        char[] charArray = letters.toCharArray();
//
//	        // Traverse through the character array
//	        for (char c : charArray) {
//	            // Check if the character is already in the HashMap
//	            if (charCountMap.containsKey(c)) {
//	                // If character is already in the map, increment its count by 1
//	                charCountMap.put(c, charCountMap.get(c) + 1);
//	            } else {
//	                // If character is not in the map, add it with count 1
//	                charCountMap.put(c, 1);
//	            }
//	        }
//
//	        // Print the character counts
//	        // This loop iterates over each entry in the charCountMap
//	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//	            // entry.getKey() returns the character
//	            // entry.getValue() returns the count of that character
//	            System.out.println(entry.getKey() + "-" + entry.getValue());
//	        }
		
		
	}

}
