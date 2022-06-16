package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentNumberInArray {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2};
		MostFrequentNumberInArray ft = new MostFrequentNumberInArray();
		int largetNum = ft.mostFrequentNumber(arr);
		System.out.println("Most Frequent number: "+ largetNum);
		
		
	}
	
	
	
	public HashMap<Integer, Integer> getArrayValuesInhashMap(int arr[])
    {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
         for(int i: arr)
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
                
        return hm;
    }
	
	
	public int mostFrequentNumber(int arr[])
	{
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		hm1= getArrayValuesInhashMap(arr);
		System.out.println(hm1);
		Set entrySet = hm1.entrySet();
		Iterator itr = entrySet.iterator();
		
		Integer mfnValue=-1;
		Integer mfKey = null;
		//Map.Entry me1 = null;
		while(itr.hasNext())
		{
			Map.Entry me = (Entry) itr.next();
			if((Integer)me.getValue() >= mfnValue)
			{
				mfKey = (Integer)me.getKey();
				mfnValue= (Integer) me.getValue();
				
			}
		}
			 
		return (int)mfKey;
	}

}
