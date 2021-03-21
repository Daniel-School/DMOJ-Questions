package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CCC2021S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n+1];
		int[] width = new int[n];
		double area = 0;
		for (int i = 0; i < n+1; i++) 
		{
			height[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			width[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) 
		{
			area = area + (width[i] * (height[i] + height[i + 1]) / 2.0);
		}
		
		System.out.println(area);
		
	}

}
