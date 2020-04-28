package org.geeks.array;

public class TestProgramForArrayRotation2 {
	/**
	 * leftRotate(arr[], d, n)
    start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
   end
   To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0], 
    arr[2] to arr[1] …and finally temp to arr[n-1]
	 */
	
	  void leftRotate(int arr[], int d, int n) {
		  
		  for(int i = 0 ; i < d; i++)
			  leftRotatebyOne(arr, n); 	  
	  }
	  
	  
	  void leftRotatebyOne(int [] arr, int n) {
		  
		  int i, temp;
		  temp = arr[0];
		  
		  for(i = 0; i < n - 1 ; i++) 
			  arr[i] = arr[i +1];
			  arr[i] = temp;
		  	  
	  }
	  
	  /* utility function to print an array */
	    void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	  
	    // Driver program to test above functions 
	    public static void main(String[] args) 
	    { 
	    	TestProgramForArrayRotation2 rotate = new TestProgramForArrayRotation2(); 
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
	        rotate.leftRotate(arr, 2, 7); 
	        rotate.printArray(arr, 7); 
	    } 
	  
	  
	  

}
