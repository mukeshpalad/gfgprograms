package easy;

import java.util.Arrays;
import java.util.Collections;

public class FindMissingNumber {
	
	/*
	 * Given an array of size N-1 such that it only contains distinct integers
	 *  in the range of 1 to N. Find the missing element.
	 * 
	 * https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1/?page=1&difficulty[]=0&sortBy=submissions
	 */
	
	public static void main(String[] args)
	{
	int[] arr = {6,1,2,8,3,4,7,10,5};
	
	int missingNumber = getNumberOfPairs(arr);
	System.out.println(missingNumber);
	
	}
	
	static int getNumberOfPairs(int[] arr)
	{
		 //Collections.sort(Arrays.asList(arr));
		 Arrays.sort(arr);
		 
		 int temp = 1;
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i]== temp) temp=temp+1;
			 else break;
			
		 }
		 
		  return temp;
	
	}

}
