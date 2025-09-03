/**
 * TwoSum.java
 *
 * This program finds two numbers in an array that add up to a target value.
 * It returns their indices if such a pair exists.
 *
 * Author: Shani Kumar Payasi
 */

import java.util.Scanner;

public class TwoSum {

    /**
     * Takes input from the user and finds two indices such that their elements sum to the target.
     *
     * @return An array containing the two indices if found, otherwise an empty array.
     */
    public static int[] twoSum() {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size and elements
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Step 2: Input target value
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Step 3: Search for two indices whose values add up to target
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found:");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " + " + arr[j] + " = " + target);
                    sc.close();
                    return new int[]{i, j};
                }
            }
        }

        // Step 4: No pair found
        System.out.println("No two sum solution found.");
        sc.close();
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = twoSum();

        if (result.length > 0) {
            System.out.println("Returned indices: [" + result[0] + ", " + result[1] + "]");
        }
    }
}

