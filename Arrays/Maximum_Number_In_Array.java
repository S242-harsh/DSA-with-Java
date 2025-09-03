public class Maximum_Number_In_Array {

    public static int findMax(int [] arr){
        int max = arr[0]; // Assume first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i]; // Update max if current element is greater
                
            }

    }
    return max; // Return the maximum value found in the array
}
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = findMax(arr);
        System.out.println("The maximum number in the array is: " + max);
    }
}
