package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
public class FibonacciSpiral {

	/*
	public static long nextNum (Stack<Integer> lastNum) 
	{
		lastNum.push(lastNum.get(0) + lastNum.get(1));
		lastNum.removeElementAt(0);
		return lastNum.get(1);
	}
	 */
	public static long[] moveDown (long[] square1, long[]square2) 
	{
		long[] square3 = new long[6];
		square3[0] = square1[0];
		square3[1] = square2[5];
		square3[2] = square2[4];
		square3[3] = square2[5];
		square3[4] = square2[4];
		square3[5] = square2[5] - ((square2[3] - square2[5]) + (square1[3] - square1[5]));
		return square3;
	}

	public static long[] moveUp (long[] square1, long[]square2) 
	{
		long[] square3 = new long[6];
		square3[0] = square2[0];
		square3[1] = square2[1] + ((square2[3] - square2[5]) + (square1[3] - square1[5]));
		square3[2] = square1[2];
		square3[3] = square3[1];
		square3[4] = square1[2];
		square3[5] = square2[3];
		return square3;
	}

	public static long[] moveLeft (long[] square1, long[]square2) 
	{
		long[] square3 = new long[6];
		square3[0] = square2[0] - ((square2[0] + square2[2]) + (square1[0] + square1[2]));
		square3[1] = square1[1];
		square3[2] = square2[0];
		square3[3] = square3[1];
		square3[4] = square3[2];
		square3[5] = square2[5];
		return square3;
	}

	public static long[] moveRight (long[] square1, long[]square2) 
	{
		long[] square3 = new long[6];
		square3[0] = square2[2];
		square3[1] = square2[3];
		square3[2] = square2[2] + ((square2[2] - square2[0]) + (square1[2] - square1[0]));
		square3[3] = square3[1];
		square3[4] = square3[2];
		square3[5] = square1[5];
		return square3;
	}

	public static long[][] arrange (long[] square1, long[] square2, long[] square3) 
	{
		square1 = square2;
		square2 = square3;
		long[][] arr = {square1,square2};
		return arr;
	}
	
	public static boolean check (long[] square2, long[] longInput) 
	{
		if (longInput[0] >= square2[0] && longInput[0] <= square2[2] && longInput[1] <= square2[3] && longInput[1] >= square2[5]) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/* 	1 ---------2
		 * 	|          |
		 * 	|          |
		 * 	|          |
		 * 	|          |
		 * 	 ----------3
		 */

		// Index = corner1x, corner1y, corner2x, corner2y, corner3x, corner3y
		long[] square1 = {0,0,1,0,1,-1};
		long[] square2 = {-1,0,0,0,0,-1};
		long[] square1Clone = {0,0,1,0,1,-1};
		long[] square2Clone = {-1,0,0,0,0,-1};
		long[][] square3 = new long[2][6];
		long[][] square3Clone = new long[2][6];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = new String[2];
		long[] longInput = new long[2];
		long count = 3;
		for (long i = 0; i < 5; i++) 
		{
			input = br.readLine().split(" ");
			longInput[0] = Integer.parseInt(input[0]);
			longInput[1] = Integer.parseInt(input[1]);
			if (longInput[0] >= 0 && longInput[0] <= 1 && longInput[1] <= 0 && longInput[1] >= -1) 
			{
				System.out.println("1");
			}
			
			else if(check(square2,longInput)) 
			{
				System.out.println("2");
			}
			
			else 
			{
				outerloop:
				while (1 == 1) 
				{
					square3 = arrange(square1,square2,moveUp(square1,square2));
					square1 = square3[0];
					square2 = square3[1];

					if (check(square2,longInput))
						break outerloop;
					else
						count++;
					
					square3 = arrange(square1,square2,moveRight(square1,square2));
					square1 = square3[0];
					square2 = square3[1];

					if (check(square2,longInput))
						break outerloop;
					else
						count++;
					
					square3 = arrange(square1,square2,moveDown(square1,square2));
					square1 = square3[0];
					square2 = square3[1];

					if (check(square2,longInput))
						break outerloop;
					else
						count++;
					
					square3 = arrange(square1,square2,moveLeft(square1,square2));
					square1 = square3[0];
					square2 = square3[1];

					if (check(square2,longInput))
						break outerloop;
					else
						count++;

				}
			System.out.println(count);
			count = 3;
			square1 = square1Clone;
			square2 = square2Clone;
			square3 = square3Clone;
			}
			
		}

	}



}
