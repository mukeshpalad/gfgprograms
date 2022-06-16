package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IntegerFibonacci {
	
	public static void main(String[] args) throws IOException
	{
	System.out.println("Enter the length of Fibonacci series ");
  	 
  	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	 int flength = Integer.parseInt(br.readLine());
  	 
  	 Fibonacci fb = new Fibonacci();
  	 List<Long> fseries = fb.fibonacci(flength);
  	 
  	System.out.println("Fibonacci Series iterative: "+ fseries);
  	System.out.println(flength+"th number is: "+ fb.getNthInFib(fseries, flength));
  	//System.out.println("Fibonacci Series Recursive: "+ new Fibonacci().fibonacciRecursive(flength));
  	
  	//long lastinFibonacci = new Fibonacci().getLastInFib(fseries);
  	
  	//System.out.println(flength+ "th number in fibonaccci series is : "+ lastinFibonacci);
  	
  	
  	//long nthinFibonacci = new Fibonacci().getNthInFib(fseries, 10);
  	//System.out.println(flength+ "th number in fibonaccci series is : "+ nthinFibonacci);
	
	}

}



class Fibonacci {
	
	public List<Long> fibonacci(int n)
	{
		List<Long> fSeries = new ArrayList<Long>();
		long sum, prev=0, next=1;
		final long  M = 1000000007;
		fSeries.add(0l);
		fSeries.add(next);
		for(int i=1; i<=n-2; i++)
		{
			sum=prev+next;
			prev = next;
			next=sum;
			
			fSeries.add(sum%M);
		}
		
		return fSeries;
		
	}
	
	
	long getLastInFib(List<Long> fSeries)
	{
		System.out.println("lenth in fibonaccci series is : "+ fSeries.size());
		return fSeries.get(fSeries.size()-1);
	
		
	}
	
	
	long getNthInFib(List<Long> fSeries, int n)
	{
		
		return fSeries.get(n-1)%1000000007;
	
		
	}
	
	
	public static long fibonacciRecursive(int number)
	{ if(number == 1 || number == 2) return 1; 
	return fibonacciRecursive(number-1) + fibonacciRecursive(number -2); //tail recursion }
	}
	


}
