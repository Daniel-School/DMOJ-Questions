package dmoj;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TimeOnTask {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// total time we have
		int time = Integer.parseInt(br.readLine());
		// total chores we have
		int chores = Integer.parseInt(br.readLine());
		// time it takes to complete each chore
		ArrayList<Integer> times = new ArrayList<Integer>();
		
		// getting all the chores into an arraylist
		for (int i = 0; i < chores;i++) 
		{
			times.add(Integer.parseInt(br.readLine()));
		}
		
		//sorting the arraylist
		times.sort(null);
		// the total amount of time spent
		int total = 0;
		
		
		for (int i = 0; i < chores; i++) 
		{
			// adding the time spent on a chore to the total time spent
			total += times.get(i);
			
			// if the total time spent is over the amount of time we have,
			// we print the amount of chores we got done
			if (total > time) 
			{
				System.out.println(i);
				break;
			}
				
		}
		
		// this probably won't work on every case but it worked here :^)
		
	}

}
