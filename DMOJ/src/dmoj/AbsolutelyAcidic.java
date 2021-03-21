package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class AbsolutelyAcidic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sensors = Integer.parseInt(br.readLine());
		//int numbers[][] = new int[2][sensors];
		ArrayList<Integer> number = new ArrayList<Integer>();
		ArrayList<Integer> frequency = new ArrayList<Integer>();
		ArrayList<Integer> sortedFrequency = new ArrayList<Integer>();
		ArrayList<Integer> input = new ArrayList<Integer>(sensors);
		int nextline;
		for (int i = 0; i < sensors; i++) 
		{
			nextline = Integer.parseInt(br.readLine());
			if (input.contains(nextline)) 
			{
				frequency.set(number.indexOf(nextline), frequency.get(number.indexOf(nextline)) + 1);
			}
			else 
			{
				number.add(nextline);
				frequency.add(1);
			}
			input.add(nextline);
		}
		
		
		for (int i:number) System.out.println(i);
		System.out.println();
		for (int i:frequency) System.out.println(i);
		System.out.println();
		for (int i:input) System.out.println(i);
		
	}

}
