package com.rootNumber;

public class findRootNumber {
//Given a number A. Return square root of the number if it is perfect square otherwise return -1.
	int value=0;
    public int solve(int A) {
    	if(A==0)return -1;
        for(int i=1;i*i<=A;i++){
            if(i*i==A)
            value= i;
            else
            value=-1;
        }
return value;
    }
}
