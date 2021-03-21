package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CCC2021S2SecondImpact {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int height = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());
		boolean[][] grid = new boolean[height][width];
		int answer = 0;
		int k = Integer.parseInt(br.readLine());
		String[] direction = new String[k];
		int[] coordinate = new int[k];
		String input;
		
		
		for (int i = 0; i < k; i++) 
		{
			input = br.readLine();
			direction[i] = input.substring(0,1);
			coordinate[i] = Integer.parseInt(input.substring(2));
		}
		
		
		
		for (int i = 0; i < k; i++) 
		{
			if (direction[i].equals("R")) 
			{
				for (int i2 = 0; i2 < width; i2++) 
				{
					grid[coordinate[i] - 1][i2] = !grid[coordinate[i] - 1][i2];
				}
			}
			
			else
			{
				for (int i2 = 0; i2 < height; i2++) 
				{
					grid[i2][coordinate[i] - 1] = !grid[i2][coordinate[i] - 1];
				}
			}
		}
		
		for (int i = 0; i < width; i++) 
		{
			for (int i2 = 0; i2 < height; i2++) 
			{
				if(grid[i2][i])
					answer++;
			}

		}
		
		System.out.println(answer);
		
	}

}
