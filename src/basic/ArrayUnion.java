package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUnion {
	
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5};
		
		ArrayUnion ft = new ArrayUnion();
		Set set = ft .findArrayUnion2(arr1, arr2);

		//for(int i: unionArray) 
			System.out.println(set);
		
		
	}
	
	
	
	public int[] findArrayUnion1(int arr1[], int arr2[])
    {
        
         int[] smallArray=null;
         int[] largeArray = null;
         
         
         if(arr1.length > arr2.length) 
        	 {
        	 largeArray = arr1;
        	 smallArray = arr2;
        	 }
         else if (arr1.length > arr2.length) 
        	 {
        	 largeArray = arr2;
        	 smallArray = arr1;
        	 }
         else 
        	 {
        	 largeArray = arr1;
        	 smallArray = arr2; 
        	 }
         
         //System.out.println("Small Array"+ smallArray);
         //List<Integer> uionArray = Arrays.asList(largeArray);
        
        int[] unionArray = new int[largeArray.length + smallArray.length];
        
        // put large array data into final array
        for(int i: largeArray)
        {
        	int j=0;
        	unionArray[j]=i;
        	j++;
        	//System.out.println(i);
        }
        
        for(int i: unionArray) System.out.println(i);
        
        
        	
        
         for(int i=0; i<smallArray.length; i++)
         {
        	 boolean flag=false;
        	 int unionArrayFilledUntil = largeArray.length;
        	 for(int j=0; j<largeArray.length; j++)
        	 {
        		 if(smallArray[i] == largeArray[j]) flag = true;
        		 break;
        	 }
        	 
        	 if(flag==false)
        	 {
        		 unionArray[unionArrayFilledUntil]=smallArray[i];
        		 unionArrayFilledUntil++;
        	 }
        		
         }
         return unionArray;
        
    }
	
	
	public Set<Integer> findArrayUnion2(int arr1[], int arr2[])
    {
        
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        // add arr1 into list 1
        for(int i: arr1) list1.add(i);
        for(int j: arr2) list2.add(j);
        
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        
        // move data to set to remove duplicates
        
        Set<Integer> set = new TreeSet<Integer>(mergedList);
        return set;
        
    }   
}
