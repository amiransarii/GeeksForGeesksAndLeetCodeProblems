package org.geeks.divideandconquer;

//https://www.geeksforgeeks.org/merge-sort/
public class TestTestMergeSort {
	/**
	 * MergeSort(arr[], l,  r)
      If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
	 */
	
	
	 private static void mergeSort(int[] arr, int left, int right) {
		  
		 if(left < right) {
			 
			 int mid = left + (right - left) /2;
			 mergeSort(arr, left, mid);
			 mergeSort(arr, mid +1, right);
			 mergeArray(arr, left, mid, right);	 		 
		 }	 
	 }

	 
	private static void mergeArray(int[] arr, int left, int mid, int right) {
		
		int leftTmpSize = mid -left + 1;
		int rightTmpSize = right - mid ;
		
		int[] leftTempArr = new int[leftTmpSize];
		int[] rightTempArr = new int[rightTmpSize];
		
		//copy  data from left to mid int templeftarray arrays	
		for(int i = 0; i <leftTmpSize ; i++)
		leftTempArr[i] = arr[left +i];
		
		
		//copy data from mid to right
		for(int j = 0; j < rightTmpSize; j++)
			rightTempArr[j] = arr[mid +1 +j];
		
		
		//Merge values and insert into Array 'arr
		int i = 0; //left 
		int j = 0; //right;
		int k = left;
		
		while (i < leftTmpSize && j < rightTmpSize) 
        { 
            if (leftTempArr[i] <= rightTempArr[j]) 
            { 
                arr[k] = leftTempArr[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = rightTempArr[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < leftTmpSize) 
        { 
            arr[k] = leftTempArr[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < rightTmpSize) 
        { 
            arr[k] = rightTempArr[j]; 
            j++; 
            k++; 
        } 
		 
		  
		  
	}

	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}//end of method
	
	
	public static void main(String args[]) {
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		System.out.println("Before  Sorting");
		printArray(array);
		
		System.out.println("\n After Sorting");
		mergeSort(array,0,array.length - 1);
		printArray(array);
		
		
	}
}
