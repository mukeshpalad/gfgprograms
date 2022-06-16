package basic;

import java.util.Arrays;

public class FindTriplets {
	
	public static void main(String[] args)
	{
		int[] arr = {0, -1, 2, -3, 1};
		FindTriplets ft = new FindTriplets();
		int largetNum = ft.findTriplets(arr);
		System.out.println("largest Number: "+ largetNum);
		
		
	}
	
	
	
	public int findTriplets(int arr[])
    {
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         return arr[arr.length-1];
        
    }

}
