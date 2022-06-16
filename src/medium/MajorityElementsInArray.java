package medium;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElementsInArray {
	
	public static void main(String[] args)
	{
		int[] arr = {3,1} ;
		MajorityElementsInArray ft = new MajorityElementsInArray();
		List<Integer> lst = ft.majorityElements(arr);
		System.out.println("Most Frequent number: "+ lst);
		
		
	}
	
	
	
	public HashMap<Integer, Integer> getArrayValuesInhashMap(int arr[])
    {
		HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        
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

	
	public List<Integer> majorityElements(int[] arr)
	{
		int majority = arr.length/2;
		
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		hm1= getArrayValuesInhashMap(arr);
		System.out.println(hm1);
		Set entrySet = hm1.entrySet();
		Iterator itr = entrySet.iterator();
		
		Integer mfnValue=-1;
		Integer mfKey = null;
		List<Integer> lst = new ArrayList<Integer>();
		while(itr.hasNext())
		{
			Map.Entry me = (Entry) itr.next();
			if((Integer)me.getValue() >= mfnValue)
			{
				mfKey = (Integer)me.getKey();
				mfnValue= (Integer) me.getValue();
				
				if(mfnValue>majority) lst.add(mfKey);
				
				
			}
		}
			 
		return lst;
		
	}
}
