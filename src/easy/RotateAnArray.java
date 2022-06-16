package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateAnArray {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		
		rotateArray2(arr, 2);
	}
	
	
	static void rotateArray(int[] arr, int d)
	{
		int[] arr2 = new int[arr.length];
		
		
		for(int i=0, j=0, k=d; i<arr.length; i++)
		{
			if(i>=d) 
				{
				arr2[j]=arr[i];
				j++;
				}
			else if(i<d)
			{
				arr2[k+1]=arr[i];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
	}
	
	
	static void rotateArray2(int[] arr, int d)
	{
		int temp=0;
		for(int i=0, j=0; i<arr.length; i++)
		{
			if(i>=d) 
				{
				temp=arr[i];
				arr[i+1]=arr[j];
				arr[j]= temp;
				j++;
				}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
