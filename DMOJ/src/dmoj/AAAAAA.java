package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;
public class AAAAAA {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int temp = x;
		ArrayList<Integer> mayor = new ArrayList<Integer>();
		ArrayList<Integer> chief = new ArrayList<Integer>();
		ArrayList<Integer> dog = new ArrayList<Integer>();
		ArrayList<Integer> treasure = new ArrayList<Integer>();
		while (x < y) 
		{
			mayor.add(x);
			x = x + 4;
		}
		x = temp;
		while (x < y) 
		{
			treasure.add(x );
			x = x + 2;
		}
		x = temp;
		while (x < y) 
		{
			chief.add(x);
			x = x + 3;
		}
		x = temp;
		while (x < y) 
		{
			dog.add(x);
			x = x + 5;
		}
		for (int i = 0; i < dog.size(); i++) 
		{
			if (treasure.contains(dog.get(i)) && chief.contains(dog.get(i)) && mayor.contains(dog.get(i)))
				System.out.println("All positions change in year " + dog.get(i));
		}
		
	}

}
