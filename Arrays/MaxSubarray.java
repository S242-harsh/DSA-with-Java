public class MaxSubarray {
    public static int maxSubArraySum(int arr[]) {
        int max_so_far = Integer.MIN_VALUE; 
        int max_ending_here = 0; 

        for (int i = 0; i < arr.length; i++) {
            max_ending_here = max_ending_here + arr[i];

            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println("Maximum subarray sum is " + maxSubArraySum(arr));
    }
}


public class MaxSubarray {

    public static void main(String[] args) {

    }
}