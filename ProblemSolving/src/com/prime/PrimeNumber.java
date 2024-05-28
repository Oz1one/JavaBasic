package com.prime;

public class PrimeNumber {
	public int solve(Long A) {
	       if(A==1)return 0;
	        for(long i=2;i*i<=A;i++){
	            if(A%i==0)
	            	return 0;
	        }
	    return 1;
	    }
}
	