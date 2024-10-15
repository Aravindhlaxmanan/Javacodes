package example;

public class RemovecenterM {

    public static void main(String[] args) {
        // Input word
        String word = "Premium";
        
        // Count occurrences of 'm'
        int mCount = 0;
        for (char c : word.toCharArray()) {
            if (c == 'm' || c == 'M') { // Considering case-insensitive count
                mCount++;
            }
        }
        
        // Find and remove the center 'm' if it exists
        if (mCount > 0) {
            int mIndex = 1;
            int centerMIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'm' || word.charAt(i) == 'M') {
                    if (mIndex == mCount / 2) {
                        centerMIndex = i;
                        break;
                    }
                    mIndex++;
                }
            }
            
            // If center 'm' found, remove it
            if (centerMIndex != -1) {
                word = word.substring(0, centerMIndex) + word.substring(centerMIndex + 1);
            }
        }
        
        // Print the results
        System.out.println("Number of 'm' characters: " + mCount);
        System.out.println("Word after removing center 'm': " + word);
    }
}