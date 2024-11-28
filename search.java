public class Main {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 25, 45, 67, 89, 12, 54, 99, 34};

        // Find the maximum value
        int max = findMax(numbers);

        // Print the result
        System.out.println("The maximum value in the array is: " + max);
    }

    public static int findMax(int[] array) {
        // Handle empty arrays
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Assume the first element is the maximum
        int max = array[0];

        // Traverse the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger value is found
            }
        }

        return max; // Return the maximum value
    }
}
