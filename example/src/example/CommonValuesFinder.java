package example;

import java.util.HashSet;
import java.util.Set;

public class CommonValuesFinder {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 8, 9, 0, 0};
        Set<Integer> result = findrepvalues(array);
        System.out.print("Result" + result);
    }
    
    public static Set<Integer> findrepvalues(int[] aravind)
    {
    	Set<Integer> seen = new HashSet<>();
    	Set<Integer> duplicate = new HashSet<>();
    	
    	for(int value : aravind)
    	{
    		if(!seen.add(value))
    			duplicate.add(value);
    	}
    	return duplicate;
    }
}