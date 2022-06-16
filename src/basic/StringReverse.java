package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class StringReverse {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter the string to Reverse: ");
   	 
   	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 String reverse ="", stringToCheck = br.readLine();
   	 reverse = new Reverse().reverseWord(stringToCheck);
   	 
   	System.out.println("Reversed string is: "+ reverse);
   	ArrayList al = new ArrayList();
  
   	//Collections.reverse(null);
   	
	}

}



class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String revStr="";
        for(int i= str.length()-1; i>=0; i--)
        {
            revStr=revStr+str.charAt(i);
        }
         return revStr;
    }
   
}
