package basic;

import java.util.Arrays;

public class FindLargestElementInArray {
	
	public static void main(String[] args)
	{
		int[] arr = {0, -1, 2, -3, 1};
		FindLargestElementInArray ft = new FindLargestElementInArray();
		
		if(ft.findTriplets(arr))
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	
	
	
	public boolean findTriplets(int arr[])
    {
         Arrays.sort(arr);
         ///System.out.println(Arrays.toString(arr));
        int tripletSum=-1;
        
        for (int i=0; i<arr.length-2; i++)
        {
            for(int j=i+1; j<arr.length-1; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    tripletSum=(arr[i]+arr[j]+arr[k]);
                    //System.out.println(tripletSum);
                    if (tripletSum==0) break;
                   // if(tripletSum==0) return true;
                    //break;
                }
                if (tripletSum==0) break;
            }
            
            if (tripletSum==0) break;
        }
        
        if (tripletSum==0) return true;
        else return false;
    }

}
