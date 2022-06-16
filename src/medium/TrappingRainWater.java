package medium;

import java.util.Arrays;
import java.util.Collections;

public class TrappingRainWater {
	
	/*
	 *Given an array arr[] of N non-negative integers representing the height 
	 *of blocks. If width of each block is 1, 
	 *compute how much water can be trapped between the blocks 
	 *during the rainy season. 
	 * 
	 * https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1/?page=2&sortBy=submissions
	 * */
	
	public static void main(String[] args)
	{
	int[] arr = {8, 8, 2, 4, 5, 5, 1};
	
	int rainWater = nthLargestNumber(arr);
	System.out.println(rainWater);
	
	}
	
	static int nthLargestNumber(int[] arr)
	{
		int high=0;
		int temp=0;
		int water=0;
		for(int i=0; i<arr.length-2; i++)
		{
			if(arr[i]>high) high=arr[i];
			
			temp=high-arr[i+1];
			water=water+temp;
			
		}
		
		
		return water;
	
	}

}
