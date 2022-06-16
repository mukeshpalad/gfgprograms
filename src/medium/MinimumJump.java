package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MinimumJump {
	
	/*
	 Given an array of N integers arr[] where each element represents
	  the max number of steps that can be made forward from that element.
	   Find the minimum number of jumps to reach the end of the array 
	   (starting from the first element). If an element is 0, 
	   then you cannot move through that element.
Note: Return -1 if you can't reach the end of the array.
	  
	  Problem link: 
	  https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1/?page=1&difficulty[]=1&sortBy=submissions
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1} ;
		int[] arr1 = {3} ;
		MinimumJump ft = new MinimumJump();
		int minJump = ft.minjump(arr);
		System.out.println("Minimum Jump: "+ minJump);
		
		
	}
	
	
	
	 public int minjump(int arr[])
	    {
			if(arr.length==1) return 0;
			if(arr[0]== 0) return -1;
			
			
			int arraylength=arr.length;
			int totalSteps=0;
			int counter=0;
			int step=0;
			
			/*
			for (int i=0, temp=0; i< arr.length; i=i+temp)
			{
				temp=arr[i];
				totalSteps = totalSteps+temp;
				
				counter++;
				
				if(totalSteps>=arr.length) break;
			}
			*/
			
			int temp=0;
			while(totalSteps < arraylength)
			{
				counter++;
				temp=arr[totalSteps];
				totalSteps = totalSteps+temp;
				
				
			}
			return counter;
	    }
	

}
