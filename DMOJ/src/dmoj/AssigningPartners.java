package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
public class AssigningPartners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String firstRow[] = new String[n - 1];
		String secondRow[] = new String[n - 1];
		int arrayIndex = 0;

		sc.nextLine();
		firstRow = sc.nextLine().split(" ");
		secondRow = sc.nextLine().split(" ");

		for(int i = 0; i < firstRow.length; i++) 
		{
			for (int y = 0; y < firstRow.length; y++) 
			{
				if (firstRow[i].equals(secondRow[y])) 
				{
					
				}
			}
		}

		for(int i = 0; i < n; i++) 
		{
			System.out.println(firstRow[i]);
			System.out.println(secondRow[i]);
		}


	}

}
