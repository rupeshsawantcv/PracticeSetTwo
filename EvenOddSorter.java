// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class EvenOddSorter {  // Class name changed according to code purpose
    public static void main(String[] args) {
        
        // Initialize the array with given elements
        int[] arr = {4,2,3,9,5,7,8,10,14,15,16};
        
        // Print the original array
        System.out.print("Original Array: " + Arrays.toString(arr));
        System.out.println();

        int n = arr.length;  // Store array length
        
        // Create ArrayLists to store even and odd numbers separately
        List<Integer> evenNumbers = new ArrayList<Integer>();
        List<Integer> oddNumbers = new ArrayList<Integer>();

        // Loop through the array (till n-1 because condition used in code)
        for(int i = 0; i < n - 1; i++){
            
            // Check if element is even
            if(arr[i] % 2 == 0){
                evenNumbers.add(arr[i]);  // Add to even list
            } else {
                oddNumbers.add(arr[i]);   // Add to odd list
            }
        }

        // Print even elements in list form
        System.out.println("Even Elements in an Array: " + evenNumbers);
        
        // Print odd elements in list form
        System.out.println("Odd Elements in an Array: " + oddNumbers);

        // Bubble Sort logic to sort the array in ascending order
        for(int k = 0; k < n - 1; k++){
            for(int f = 0; f < n - 1 - k; f++){
                
                // Swap elements if the previous one is greater
                if(arr[f] > arr[f + 1]){
                    int temp = arr[f];
                    arr[f] = arr[f + 1];
                    arr[f + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: " + Arrays.toString(arr));
    }
}
