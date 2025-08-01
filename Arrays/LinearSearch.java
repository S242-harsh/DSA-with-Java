/**
 * LinearSearch.java
 * 
 * This program demonstrates a basic implementation of linear search in Java.
 * It searches for a specific key in an integer array and returns the index if found.
 * 
 * Author: Shani Kumar Payasi
 */

public class LinearSearch {

    /**
     * Performs linear search on the array to find the key.
     * 
     * @param arr The array to be searched.
     * @param key The value to search for.
     * @return The index of the key if found, otherwise -1.
     */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Key found at index i
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;

        int result = linearSearch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
