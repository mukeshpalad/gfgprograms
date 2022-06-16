package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class SubArrayWithGivenSum {
	
	/*
	 * Given an unsorted array A of size N that contains only non-negative integers,
	 *  find a continuous sub-array which adds to a given number S.
	 *  In case of multiple subarrays, 
	 *  return the subarray which comes first on moving from left to right.
	 * 
	 *https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/?page=1&difficulty[]=0&sortBy=submissions
	 */
	
	public static void main(String[] args)
	{
	int[] arr = {1,2,3,7,5};
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	
	List<Integer> subArrayPosition = getNumberOfPairs(arr1, 15);
	System.out.println(subArrayPosition);
	
	}
	
	static ArrayList<Integer> getNumberOfPairs(int[] arr, int sum)
	{
		ArrayList<Integer> subArray = new ArrayList<Integer>();
		 
		 int pos1 = -1;
		 int pos2 = -1;
		 int sum1=0;
		 
		 label1:
		 for(int i=0; i<arr.length; i++)
		 {
			 sum1=0;
			 
			 for(int j=i; j<arr.length; j++)
			 {
				 sum1=sum1+arr[j];
				 if(sum1==sum)
				 {
					 pos1=i+1;
					 pos2=j+1;
					 break label1;
				 }else if(sum1> sum) break;
			 }
		 }
		 
		 if(pos1==-1 && pos2==-1)  subArray.add(-1);
		 else 
		 {
			 subArray.add(pos1);
			 subArray.add(pos2);
			 
		 }
		 
		return subArray;
	
	}

}
