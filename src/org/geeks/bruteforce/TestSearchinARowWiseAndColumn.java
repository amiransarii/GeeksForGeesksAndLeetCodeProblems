package org.geeks.bruteforce;

public class TestSearchinARowWiseAndColumn {
	
	
	private static boolean isFound(int[][] matrix, int size, int key) {
		
		if(size == 0)
			return false;
		
		//traverse through the matrix 
		for(int i = 0; i < size ; i++) {
			
			for(int j = 0; j < size ; j++) {
				
				if(matrix[i][j] == key) {
					System.out.println( "Found at "+i + " "+j);
					return true;
				}
				
			}
			
			
		}
		
		
		
		return false;
	}
	
	public static void main(String args[]) {
		
		int  mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
	
		boolean res = isFound(mat,  4,29);
		System.out.println(res);
	}

}
