package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EscapeRoom {
	
	static int[][] grid;
	static ArrayList<Integer> found = new ArrayList<Integer>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		grid = new int[m][n];
		for (int i = 0; i < m; i++) 
		{
			grid[i] = toIntArray(br.readLine().split(" "));
		}
		
		if(findPath(1,1)) 
		{
			System.out.println("yes");
		}
		else 
		{
			System.out.println("no");
		}
		
	}

	public static boolean findPath (int r, int c) 
	{
		if (r == grid.length && c == grid[0].length) 
		{
			return true;
		}
		
		if (r > grid.length || c > grid[0].length) 
		{
			return false;
		}
		
		int x = grid[r-1][c-1];
		int insertionPoint = Collections.binarySearch(found, x);
		if (insertionPoint >= 0) 
		{
			return false;
		}
		else 
		{
			found.add(Math.abs(insertionPoint) - 1, x);
		}
		
		for (int i = 1; i <= Math.sqrt(x); i++) 
		{
			if (x % i == 0) 
			{
				if (findPath(i,x/i)) 
				{
					return true;
				}
				if (findPath(x/i,i)) 
				{
					return true;
				}
			}
		}
		
		return false;
	}

	public static int[] toIntArray(String[] arr) throws NumberFormatException
	{
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
}
