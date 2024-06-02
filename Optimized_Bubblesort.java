package datastructures;

import java.util.Arrays;

public class Optimized_Bubblesort {

	public static void main(String[] args) {
		 // Initialize an array with unsorted integers
		 int[] array = {64, 34, 25, 12, 22, 11, 90};
	        System.out.println("Original array: " + Arrays.toString(array));
	        bubbleSort(array);
	        System.out.println("Sorted array: " + Arrays.toString(array));
	}

    // Optimized Bubble Sort method to sort an integer array
	 static void bubbleSort(int[] array) {
	        int n = array.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                	 // If the current element is greater than the next element, swap them
	                    int temp = array[j];
	                    array[j] = array[j + 1];// Swap the current element with the next element
	                    array[j + 1] = temp;// Place the current element in the next position
	                    swapped = true;// Set the swapped flag to true
	                }
	            }

	            // If no two elements were swapped in the inner loop, then break
	            if (!swapped)
	                break;
	        }
		

}
}
