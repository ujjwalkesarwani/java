public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 9, 2};  // Given array
        int max = arr[0], min = arr[0];

        // Loop to find max and min
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Print results
        System.out.println("Max: " + max + ", Min: " + min);
    }
}