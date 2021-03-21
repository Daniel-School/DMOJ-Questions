package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class KnightierHop {
	
	public static int recursion ( int[] target, int[] knight,int[] moves, int maxMoves, int arrayIndex) 
	{
		int[] simulation = knight;
		for (int i = 0; i < maxMoves; i++) 
		{
			if (moves[i] == 1) 
			{
				simulation[0] += 1;
				simulation[1] += 2;
			}
			else if (moves[i] == 2) 
			{
				simulation[0] += 2;
				simulation[1] += 1;
			}
			else if (moves[i] == 3) 
			{
				simulation[0] += 2;
				simulation[1] -= 1;
			}
			else if (moves[i] == 4) 
			{
				simulation[0] += 1;
				simulation[1] -= 2;
			}
			else if (moves[i] == 5) 
			{
				simulation[0] -= 2;
				simulation[1] -= 1;
			}
			else if (moves[i] == 6) 
			{
				simulation[0] -= 1;
				simulation[1] -= 2;
			}
			else if (moves[i] == 7) 
			{
				simulation[0] -= 2;
				simulation[1] += 1;
			}
			else if (moves[i] == 8) 
			{
				simulation[0] -= 1;
				simulation[1] += 2;
			}
			/*switch (moves[i]) 
			{
			case 1:
				simulation[0] += 1;
				simulation[1] += 2;
				break;
			case 2:
				simulation[0] += 2;
				simulation[1] += 1;
				break;
			case 3:
				simulation[0] += 1;
				simulation[1] -= 2;
				break;
			case 4:
				simulation[0] += 2;
				simulation[1] -= 1;
				break;
			case 5:
				simulation[0] -= 1;
				simulation[1] -= 2;
				break;
			case 6:
				simulation[0] -= 2;
				simulation[1] -= 1;
				break;
			case 7:
				simulation[0] -= 1;
				simulation[1] += 2;
				break;
			case 8:
				simulation[0] -= 2;
				simulation[1] += 1;
				break;
			}*/
		}
		if (simulation == target || maxMoves == 6) 
		{
			return maxMoves;
		}
		moves[arrayIndex] += 1;
		if (moves[arrayIndex] == 8) 
		{
			arrayIndex += 1;
		}
		
		if (moves[maxMoves] == 9) 
		{
			maxMoves += 1;
			arrayIndex = 0;
			for (int i = 0; i < maxMoves; i++) 
			{
				moves[i] = 0;
			}
		}
		
		return recursion(target, knight, moves, arrayIndex, maxMoves);
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
		int[] moves = {0,0,0,0,0,0};
		
		System.out.println(recursion(target, knight, moves, 0, 0));
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
