package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MockCCC2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> letter = new ArrayList<String>();
		String yep;
		
		for (int i = 0; i < input.length(); i++) 
		{
			yep = Character.toString(input.charAt(i));
			if (letter.contains(yep)) 
			{
				list.set(letter.indexOf(yep), list.get(letter.indexOf(yep)) + 1 );
			}
			else 
			{
				letter.add(yep);
				list.add(1);
			}
			
		}
		
		for (int i = 0; i < list.size(); i++) 
		{
			result = result * (list.get(i) + 1);
		}
		
		System.out.println(result % 1000000007);
	}

}
