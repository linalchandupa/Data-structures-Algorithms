package datastructures;

public class Bubble_Sort {

	public static void main(String[] args) {
		//  Initialize the array to be sorted
		int nums[]= {8,6,9,5,1,3};
		int size = nums.length;
		int temp=0;
		
		System.out.println("Before Sorting");
		for (int num : nums) {
			System.out.print(num+ " ");
		}
		
		// Bubble sort algorithm
		for(int i=0;i<size;i++) {
			// Inner loop for comparing adjacent elements
			for(int j=0;j<size-i-1;j++) {
				// Compare the current element with the next element
				if(nums[j]>nums[j+1]) {
					// Swap the elements if they are in the wrong order
					temp=nums[j]; 
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		// Print the array after sorting
		System.out.println();
		System.out.println("After Sorting");
		for (int num : nums) {
			System.out.print(num+ " ");
		}
	}

}
