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
public class MockCC2SecondImpact {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		HashMap<String,Integer> map = new HashMap<>();
		int result = 1;
		for (int i = 0; i < input.length(); i ++) 
		{
			if (map.containsKey(String.valueOf(input.charAt(i)))) 
			{
				map.put(String.valueOf(input.charAt(i)), map.get(String.valueOf(input.charAt(i))) + 1);
			}
			else 
			{
				map.put(String.valueOf(input.charAt(i)), 1);
			}
		}
		
		for (Map.Entry<String,Integer> e : map.entrySet()) 
		{
			result = result * (e.getValue() + 1);
		}
		
		System.out.println(result);
	}

}
