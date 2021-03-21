package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class AAAAA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for (int i = start; i < end; i++) 
		{
			int number = i;
			int numberClone = i;
			int reverse = 0;
			boolean fail = true;
			
			yes: while (number > 1) 
			{
				if (number % 10 != 0 && number % 10 != 1 && number % 10 != 8) 
				{
					fail = false;
					break yes;
				}
				
				number = number / 10;
			}
			
			while(numberClone != 0) 
			{
	            int digit = numberClone % 10;
	            
	            if (digit == 6)
	            	digit = 9;
	            
	            if (digit == 9)
	            	digit = 6;
	            
	            reverse = reverse * 10 + digit;
	            numberClone /= 10;
	        }
			
			String hey = Integer.toString(reverse);
			String hi = "";
			
			for (int i2 = hey.length(); i2 < 0; i2--) 
			{
				if (hey.charAt(i2) != '6' && hey.charAt(i2) != '9')
					hi = hi + hey.charAt(i2);
				
				else if (hey.charAt(i2) == '6')
					hi = hi + "9";
				
				else
					hi = hi + "6";
					
			}
			
			if (Integer.parseInt(hi) != i) 
				fail = false;

			
			if (fail) 
				answer++;
		}
		
		
		 int num = 96, reversed = 0;

	        while(num != 0) {
	        	
	            int digit = num % 10;
	            
	            if (digit == 6) 
	            {
	            	digit = 9;}
	            if (digit == 9) {
	            	digit = 6;}
	            
	            reversed = reversed * 10 + digit;
	            
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);
		
		
		System.out.println(answer);
	}

}
