package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class MulipleChoice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		String answers[] = new String[size];
		int correct = 0;
		for (int i = 0; i < answers.length; i++) 
		{
			answers[i] = br.readLine();
		}
		for (int i = 0; i < answers.length; i++) 
		{
			if (answers[i].equals(br.readLine())) 
			{
				correct++;
			}
		}
		System.out.println(correct);
	}

}
