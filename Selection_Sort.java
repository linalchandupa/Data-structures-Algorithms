package datastructures;

public class Selectionsort {

	public static void main(String[] args) {
		
		// Create an array to be sorted
		 int[] arr = {64, 25, 12, 22, 11};
	        
	        System.out.println("Array before sorting:");
	        printArray(arr);
	        
	        selectionSort(arr);
	        
	        System.out.println("Array after sorting:");
	        printArray(arr);
	}

	 // Method to perform selection sort on an array
	public static void selectionSort(int[] arr) {
        int n = arr.length;
        
     // Iterate over each element of the array except the last one 
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element in the remaining unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
	// Method to print the elements of an array
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
