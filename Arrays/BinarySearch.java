// public class BinarySearch {
//     public static int binarySearch(int[] arr, int key) {
//         int mid = arr.length / 2;
//         if (mid==key) {
//             return mid; // Key found at index mid
//         }
//         if(mid<key){
//             for(int i=mid+1; i < arr.length; i++) {
//                 if (arr[i] == key) {
//                     return i; // Key found at index i
//                 }

//             }
         

//         }else{
//             for(int i=0; i < mid; i++) {
//                 if (arr[i] == key) {
//                     return i; // Key found at index i
//                 }
//             }
//         }
//         return -1; // Key not found
        
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,3,4,5,6,7,8,9};
//         int key=5;
//         int result = binarySearch(arr, key);
//         if (result != -1) {
//             System.out.println("Element " + key + " found at index: " + result);
//         } else {
//             System.out.println("Element " + key + " not found in the array.");
//         }
        
//     }

    
// }


