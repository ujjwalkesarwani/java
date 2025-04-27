public class kadanes {

        public static void kadanes(int num[]) {
            // Handle case where array is empty
            if (num.length == 0) {
                System.out.println("Array is empty.");
                return;
            }
    
            int ms = num[0];  // Maximum sum initialized to the first element
            int cs = num[0];  // Current sum initialized to the first element
    
            // Iterate from the second element
            for (int i = 1; i < num.length; i++) {
                cs = Math.max(num[i], cs + num[i]); // Current sum is either the current element or current sum + current element
                ms = Math.max(cs, ms); // Update the maximum sum
            }
    
            System.out.println("Maxsum of Sub Array = " + ms);
        }
    
        public static void main(stringprob[] args) {
            int num[] = {-2, -3, -4, -1, -2, -1, -5, -3};
            kadanes(num); // Call Kadane's function to find the maximum sum subarray
        }
    }
    

