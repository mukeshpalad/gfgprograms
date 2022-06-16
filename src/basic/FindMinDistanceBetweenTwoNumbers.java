package basic;

import java.util.Arrays;

public class FindMinDistanceBetweenTwoNumbers {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,2};
		FindMinDistanceBetweenTwoNumbers ft = new FindMinDistanceBetweenTwoNumbers();
		int largetNum = ft.findMinDistance(arr, 1,2);
		System.out.println("largest Number: "+ largetNum);
		
		
	}
	
	
	
	public int findMinDistance(int arr[], int x, int y)
    {
        int minD = -1;
        
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]==x)
        	{
        		
        		int tempYPosRight=0;
        		int tempYPosLeft=0;
        		for(int j=i+1; j<arr.length; j++)
        		{
        			if(arr[j]==y) tempYPosRight++;
        		}
        		
        		for(int j=i-1; j>=0; j--)
        		{
        			if(arr[j]==y) tempYPosLeft++;
        		}
        		
        		minD = Math.min(tempYPosRight, tempYPosLeft);
        	}
        	
        	
        		
        }
        
        return minD;
        
    }

}
