package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class SurmisingASprintersSpeed {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int counter = 0;
		double result;
		double finalAnswer = 0;
		int time[] = new int[n];
		int distance[] = new int[n];
		String input[] = new String[2*n];
		for (int i = 0; i < n ; i++) 
		{
			input = br.readLine().split(" ");
			time[i] = Integer.parseInt(input[0]);
			distance[i] = Integer.parseInt(input[1]);
		}
		
		
		for (int i = 0; i < n; i++) 
		{
			for (int i2 = 0; i2 < n - 1 - counter; i2++) 
			{
				result = Math.abs(((double)distance[i2+counter] - distance[i2+1+counter]) /(time[i2+counter] - time[i2+1+counter])); 
				if (result > finalAnswer) 
				{
					finalAnswer = result;
				}
			}
		
			counter++;
		}
		
		System.out.println(finalAnswer);
		


	}

}
