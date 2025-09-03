public class ReverseExample {

    public static int[] reverseInArray(int[] arr) {
        int n = arr.length;

        // Swap elements
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        return arr; // same array ka address return hoga
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        int[] reversed = reverseInArray(original);

        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
