package org.geeks.divideandconquer;

//https://www.geeksforgeeks.org/quick-sort/
public class TestQuickSort {
	
	static void quickSort(int[] arr, int start, int end) {
		 
		if(start < end) {
			int pivot = partition(arr, start, end);
			
			 // Recursively sort elements before 
            // partition and after partition 
			quickSort(arr, start, pivot-1 );
			quickSort(arr, pivot + 1,end);
			
		}
	}
	
	static int partition(int[] array, int p, int q) {
		
		int pivot = q; //pivot as a last element
		int i = p - 1;
		
		for(int j = p; j <= q; j++) {
			
			if(array[j] <= array[pivot]) {
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			
		}
		return i;
	}
	
	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}//end of method

	  // Driver program 
    public static void main(String args[]) 
    { 
        int array[] = {10, 7, 8, 9, 1, 5}; 
       // int n = arr.length; 
        
        System.out.println("User entered Array: ");
		printArray(array);
		
		 quickSort(array, 0, array.length-1);
		
		System.out.println("\n\nAfter sorting: ");
	  printArray(array);
    }

}
