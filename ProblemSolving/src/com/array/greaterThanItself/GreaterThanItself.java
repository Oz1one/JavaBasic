package com.array.greaterThanItself;

//Given an array of N elements, count the number of elements having at least q element greater than itself

//Solution: There are various ways to solve. one way can be to find compare all elements one by one.
// The second and most intuitive solution is to find the frequency of the highest element and subtract it from
// the number of elements.
//eg: [1, 7, 2, 0, 5, 7, 0]: Answer is 5
//eg: [2, 3, 10, 7, 3, 2,10, 8] Answer is 6
//eg: [7,7,7,7,7,7] Answer is 0

public class GreaterThanItself {

	public int solve(int[] A) {
		int max_value=0;
		int max_value_count=0;
		for (int i=0;i<A.length;i++) {
			if(A[i]>max_value) {
				max_value=A[i];
				max_value_count=1;
			}
			else if(A[i]==max_value) {
				max_value_count += 1;
				
			}
				
		}
		
		return A.length-max_value_count;
	}
	
	
}
