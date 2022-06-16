package medium;

import java.util.Arrays;
import java.util.Collections;

public class NthLargstNumber {
	
	/*
	 *Given an array arr[] and an integer K where K is smaller than size of array, 
	 *the task is to find the Kth smallest element in the given array. 
	 *It is given that all array elements are distinct.
	 * 
	 * https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1/?page=1&sortBy=submissions
	 * */
	
	public static void main(String[] args)
	{
	int[] arr = {7, 10, 4, 3, 20, 15};
	
	int nthlargestNumber = nthLargestNumber(arr, 3);
	System.out.println(nthlargestNumber);
	
	}
	
	static int nthLargestNumber(int[] arr, int k)
	{
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 return arr[k-1];
	
	}

}
