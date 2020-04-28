package org.geeks.bruteforce;

public class TestMatrixMultiplication {
	
	int N = 5;
	void multiply(int A[][], int B[][], int C[][]) 
	{ 
	    for (int i = 0; i < N; i++) 
	    { 
	        for (int j = 0; j < N; j++) 
	        { 
	            C[i][j] = 0; 
	            for (int k = 0; k < N; k++) 
	            { 
	                C[i][j] += A[i][k]*B[k][j]; 
	            } 
	        } 
	    } 
	} 
	
}