package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Integerpallendrom {
	
	
	public static void main(String[] args) throws IOException
	{
	 boolean isPldrom = new Pallendrom().isPalindrome(1002);
	 System.out.println("Is Pallendrom : "+ isPldrom);
  	
  	//long lastinFibonacci = new Fibonacci().getLastInFib(fseries);
  	
  	//System.out.println(flength+ "th number in fibonaccci series is : "+ lastinFibonacci);
  	
  	
  	//long nthinFibonacci = new Fibonacci().getNthInFib(fseries, 10);
  	//System.out.println(flength+ "th number in fibonaccci series is : "+ nthinFibonacci);
	
	}

}


 class Pallendrom
{
	 public static boolean isPalindrome(int number) {
	        int palindrome = number; // copied number into variable
	        int reverse = 0;

	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }

	        // if original and the reverse of number is equal means
	        // number is palindrome in Java
	        if (number == reverse) {
	            return true;
	        }
	        return false;
	    }
}
