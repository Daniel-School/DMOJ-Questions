package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CCC2021S2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		int height = sc.nextInt();
		int width = sc.nextInt();
		boolean[][] grid = new boolean[height][width];
		int answer = 0;
		int k = sc.nextInt();
		String[] direction = new String[k];
		int[] coordinate = new int[k];
		
		for (int i = 0; i < k; i++) 
		{
			direction[i] = sc.next();
			coordinate[i] = sc.nextInt();
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
					/*if (grid[i2][coordinate[i2]])
						grid[i2][coordinate[i2]] = false;
					else
						grid[i2][coordinate[i2]] = true;
						*/
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
