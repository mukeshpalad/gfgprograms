package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class FindDuplicatesInArray {
	
	/*
	 * Given an array a[] of size N which contains elements from 0 to N-1,
	 * you need to find all the elements occurring more than once in the given array.
	 * 
	 * https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1/?page=1&difficulty[]=0&sortBy=submissions
	 */
	
	public static void main(String[] args)
	{
	int[] arr = {0,3,1,2};
	
	List<Integer> duplicates = getDupllicates(arr);
	System.out.println(duplicates);
	
	}
	
	static List<Integer> getDupllicates(int[] arr)
	{
		 Arrays.sort(arr);
		 
		 ArrayList<Integer> dup = new ArrayList<Integer>();
		 boolean flag=false;
		 for(int i=1; i<arr.length; i++)
		 {
			 if(arr[i]== arr[i-1]) dup.add(arr[i]);
			
		 }
		 
		Set set = new LinkedHashSet<Integer>(dup);
		ArrayList<Integer> dup2 = new ArrayList<Integer>(set);
		
		if (dup2.size()> 0 ) return dup2;
		else 
		{
			dup2.add(-1);
		}
	
		return dup2;
    
	}

}
