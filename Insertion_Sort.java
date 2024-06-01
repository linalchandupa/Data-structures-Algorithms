package datastructures;

public class InsertionSort {

	public static void main(String[] args) {
		
		// Initialize the array to be sorted
		
		int[] arr = {85, 12, 59, 45, 72, 51};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

	}
	
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // Store the current element to be compared
            int j = i - 1; // Initialize j to the index of the previous element

            /* Move elements of arr[0..i-1], that are greater than key,
               to one position ahead of their current position */
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j = j - 1; // Move to the previous element
            }
            arr[j + 1] = key; // Insert the key in its correct position
        }
    }


}
