package example;



public class SecondLargestNumber {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {34, 23, 54, 12, 67, 89, 11, 32, 67};

        // Find and print the second largest number
        try {
            int secondLargest = findSecondLargest(numbers);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest number in the array");
        }

        return secondLargest;
    }
}