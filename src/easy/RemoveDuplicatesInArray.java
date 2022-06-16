package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class RemoveDuplicatesInArray {
	
	/*
	 * Given a sorted array A[] of size N, delete all the duplicates elements from A[].
		Note: Don't use set or HashMap to solve the problem.
	 * https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1/?page=2&difficulty[]=0&sortBy=submissions
	 */
	
	public static void main(String[] args)
	{
	int[] arr = {1,3,4,5,6,12,13,17,19,22,23,25,27,28,28,35,36,37,39,43,46,48,54,59,62,63,65,68,68,70,70,72,79,82,83,92,92,93,95,96,96,100};
	
	int duplicates = getDupllicates2(arr);
	System.out.println(duplicates);
	
	}
	
	static int getDupllicates(int[] arr)
	{
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 
		 for(int i=0; i<arr.length; i++)
		 {
			if(!(al.contains(arr[i])))
			{
				al.add(arr[i]);
			}	
			
		 }
		
		 
		System.out.println(al);
		return al.size();
    
	}
	
	
	
	static int getDupllicates2(int[] arr)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		 
		 for(int i=0; i<arr.length; i++)
		 {
			if(!(al.contains(arr[i])))
			{
				al.add(arr[i]);
			}	
			
		 }
		 
		 int[] arr2 = new int[al.size()];
		 for(int i=0; i<al.size(); i++)
		 {
			 arr2[i] = al.get(i);
		 }
		 
		 return arr2.length;
    
	}

}
