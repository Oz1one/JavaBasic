package com.array.goodArray;

//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
//Check if any good pair exist or not.

public class GoodArray {
	public int solve(int[] A, int B) {
		for (int i=0;i<A.length;i++) {
			for (int j=0;j<A.length;j++) {
				if(A[i]+A[j]==B && i != j)
					return 1;
			}
		}
		return 0;
	}
	
}
