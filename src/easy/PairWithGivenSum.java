package easy;

import java.util.Arrays;
import java.util.Collections;

public class PairWithGivenSum {
	
	/*
	 * You are given an array Arr of size N. 
	 * You need to find all pairs in the array that sum to a number K. 
	 * If no such pair exists then output will be -1. 
	 * The elements of the array are distinct and are in sorted order.
	 * 
	 * https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1/?page=1&category[]=Algorithms&sortBy=submissions
	 */
	
	public static void main(String[] args)
	{
	int[] arr = {1, 2, 3, 4, 5, 6, 7};
	
	int numOfPairs = getNumberOfPairs(arr, 8);
	System.out.println(numOfPairs);
	
	}
	
	static int getNumberOfPairs(int[] arr, int sum)
	{
		System.out.println("before :"+arr[0]);
		//reverse the sorted array:
		 Collections.reverse(Arrays.asList(arr));
		 
		 System.out.println("after :"+arr[0]);
		 
		 int pair = 0;
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i]>=sum) continue;
			 else
			 {
				 for(int j=i+1; j<arr.length; j++)
				 {
					 int sum1 = arr[i] + arr[j];
					 if(sum == sum1)
					 {
						 pair = pair+1;
					 }
				 }
			 }
		 }
		 
		 
		 if (pair==0) return -1;
		 else return pair;
	
	}

}
