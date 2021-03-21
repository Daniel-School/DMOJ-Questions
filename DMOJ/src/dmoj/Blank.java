package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Blank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<String>();
		String[] list = new String[1000];
		String[] letter = new String[1000];
		String[] pass = new String[1000];

		String stop = " ";
		int index = 0;
		int counter = 0;
		int countercounter = 0;
		while (!stop.equals("666")) 
		{
			stop = sc.next();
			if (stop.equals("666")) break;
			list[index] = stop;
			stop = sc.next();
			if (stop.equals("666")) break;
			letter[index] = stop;
			if (stop.equals("666")) break;
			stop = sc.next();
			pass[index] = stop;
			//letter = stop.split(" ");
			//pass[index] = sc.next();
			System.out.println(list[index]);
			//System.out.println(list[index + 1]);
			//System.out.println(list[index + 2]);
			index++;
		}
		//list[2999] = "";
		for (int i = 0; i < list.length; i++) 
		{
			String[] hey = list[i].split("-");
			
			/*
			for (int y = 0; y < pass[i].length();y++) 
			{
				if(pass[i].charAt(y) == (letter[i].charAt(0))) 
				{
					counter++;
				}
			}
			*/
			
			if (pass[i].charAt(Integer.parseInt(hey[0]) - 1) == letter[i].charAt(0) && pass[i].charAt(Integer.parseInt(hey[1]) - 1) != letter[i].charAt(0)) 
			{
				countercounter++;
			}
			if (pass[i].charAt(Integer.parseInt(hey[0]) - 1) != letter[i].charAt(0) && pass[i].charAt(Integer.parseInt(hey[1]) - 1) == letter[i].charAt(0)) 
			{
				countercounter++;
			}
			
			counter = 0;
			/*System.out.println(hey[0]);
			System.out.println(hey[1]);
			System.out.println(letter[i].charAt(0));
			System.out.println(pass[i]);*/
		}
		System.out.println(countercounter);

	}

}
