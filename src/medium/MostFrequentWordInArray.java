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

public class MostFrequentWordInArray {
	
	/*
	 Given an array arr containing N words consisting of lowercase characters.
	  Your task is to find the most frequent word in the array. 
	  If multiple words have same frequency, 
	  then print the word whose first occurence occurs last in the array 
	  as compared to the other strings with same frequency.
	  
	  Problem link: 
	  https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings3528/1#
	 */
	
	public static void main(String[] args)
	{
		String[] arr = {"elgefh", "elgefh", "vuxct", "elgefh", "kmrht", "elgefh", "kmrht", "kmrht", "hjfd", "hjfd", "kmrht", "vuxct", "elgefh", "mzwlcq", "kmrht"};
		MostFrequentWordInArray ft = new MostFrequentWordInArray();
		String largetNum = ft.mostFrequentWord(arr);
		System.out.println("Most Frequent number: "+ largetNum);
		
		
	}
	
	
	
	 public Map<String, Integer> getArrayValuesInhashMap(String arr[])
	    {
			Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
	         
	         for (int i=0; i<arr.length; i++)
	         {
	            if(hm.containsKey(arr[i]))
	        	 {
	        	   hm.put(arr[i], hm.get(arr[i])+1);
	        	 }
	        	 else
	        	 {
	        		 hm.put(arr[i], 1);
	        	 } 
	         }
	         
	        System.out.println(hm);       
	        return hm;
	    }
	
	
	public String mostFrequentWord(String arr[])
    {
       Map<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		hm1= getArrayValuesInhashMap(arr);
		
		Set entrySet = hm1.entrySet();
		Iterator itr = entrySet.iterator();
		
		Integer mfValue=-1;
		//Map.Entry me1 = null;
		String mfString = null;
		boolean isFirstItr = true;
		Set<String> set = new LinkedHashSet<String>();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			if((Integer)me.getValue() >= mfValue)
			{
				
				
				mfString = (String)me.getKey();
				mfValue= (Integer) me.getValue();
				
				set.add(mfString);
				
			}
		}
		
		 System.out.println(set); 
		return mfString;
    }
	
}
