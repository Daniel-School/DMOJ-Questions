package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;



public class NewMaze {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Node> q = new ArrayDeque<Node>();
		
		int x = Integer.parseInt(br.readLine());
		
		for (int k = 0; k < x; k++) 
		{
			int rows = Integer.parseInt(br.readLine());
			int cols = Integer.parseInt(br.readLine());
			
			char[][] maze = new char[rows][cols];
			int[][] grid = new int[rows][cols];
			
			// get maze
			for (int i = 0; i < rows; i++) 
			{
				for (int j = 0; j < cols; j++) 
					maze[i][j] = (char)br.read();
				br.readLine();
			}
			
			
			// set grid to "not there"
			for (int i = 0; i < rows; i++) 
			{
				for (int j = 0; j < cols; j++) 
					grid[i][j] = -1;
			}
			
			grid[0][0] = 1; // set depth for the first node
			q.add(new Node(0,0));
			
			while (!q.isEmpty()) 
			{
				Node node = q.remove();
				
				int r = node.r;
				int c = node.c;
				int n = grid[r][c]; // current depth
				
				//up
				if ((maze[r][c] == '+' || maze[r][c] == '|') && r > 0 && maze[r-1][c] != '*' && grid[r-1][c] == -1) 
				{
					grid[r - 1][c] = n + 1;
					q.add(new Node (r-1,c));
				}
				
				//down
				if ((maze[r][c] == '+' || maze[r][c] == '|') && r < rows - 1 && maze[r+1][c] != '*' && grid[r+1][c] == -1) 
				{
					grid[r + 1][c] = n + 1;
					q.add(new Node (r + 1,c));
				}
				
				//left
				if ((maze[r][c] == '+' || maze[r][c] == '-') && c > 0 && maze[r][c-1] != '*' && grid[r][c-1] == -1) 
				{
					grid[r][c - 1] = n + 1;
					q.add(new Node (r,c - 1));
				}
				
				if ((maze[r][c] == '+' || maze[r][c] == '-') && c < cols - 1 && maze[r][c+1] != '*' && grid[r][c+1] == -1) 
				{
					grid[r][c + 1] = n + 1;
					q.add(new Node (r,c + 1));
				}
			}
			
			System.out.println(grid[rows - 1][cols - 1]);
			
			
		}

	}

}

class Node
{
	public int r,c;
	public Node(int r, int c) 
	{
			this.r = r;
			this.c = c;
	}
}
