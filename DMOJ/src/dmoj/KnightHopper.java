package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class KnightHopper {
	
	public static int recursion (int count, int[] target, int[] knight) 
	{
		if (knight[0] > target [0]) //knight is to the right of target
		{
			if (knight[1] > target[1]) //knight is above target
			{
				if (knight[0] - 2 == target[0] && knight[1] - 1 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] - 1 == target[0] && knight[1] - 2 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] - 1 > 0 && knight[1] - 2 > 0)
				{
					knight[0] -= 1;
					knight[1] -= 2;
				}
				else
				{
				    knight[0] -= 2;
				    knight[1] -= 1;
				}
			}
			else //knight is below target
			{
				if (knight[0] - 2 == target[0] && knight[1] + 1 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] - 1 == target[0] && knight[1]+ 2 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] - 1 > 0 && knight[1] + 2 > 0)
				{
					knight[0] -= 1;
					knight[1] += 2;
				}
				else 
				{
				    knight[0] -= 2;
				    knight[1] -= 1;
				}
			}
		}
		
		else if (knight[0] < target[0]) //knight is to the left of target
		{
			if (knight[1] > target[1]) //knight is above target
			{
				if (knight[0] + 2 == target[0] && knight[1] - 1 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] + 1 == target[0] && knight[1] - 2 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] + 1 > 0 && knight[1] - 2 > 0)
				{
					knight[0] += 1;
					knight[1] -= 2;
				}
				else
				{
				    knight[0] += 2;
				    knight[1] -= 1;
				}
			}
			else //knight is below target
			{
				if (knight[0] + 2 == target[0] && knight[1] + 1 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] + 1 == target[0] && knight[1] + 2 == target[1]) 
				{
					return count + 1;
				}
				else if (knight[0] + 1 > 0 && knight[1] + 2 > 0)
				{
					knight[0] += 1;
					knight[1] += 2;
				}
				else 
				{
				    knight[0] += 2;
				    knight[1] += 1;
				}
			}
		}
		
		return recursion(count + 1, knight, target);
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[8][8]; 
		int[] knight = new int[2];
		int[] target = new int[2];
		
		String input = br.readLine();
		knight[0] = input.charAt(0) - 48;
		knight[1] = input.charAt(2) - 48;
		
		input = br.readLine();
		target[0] = input.charAt(0) - 48;
		target[1] = input.charAt(2) - 48;
		
		System.out.println(recursion(0, target, knight));
		//System.out.println(knight[0] + " " + knight[1] + " " + target[0] + " " + target[1]);
		

		

		/*
		for (int i = 0; i < 8; i++) 
		{ 
			for (int j = 0; j < 8; j++) 
			{ 
				System.out.print(arr[i][j] + " "); 
			} 
			System.out.println("");
		}*/

	}
}
