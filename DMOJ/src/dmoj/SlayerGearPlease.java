package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class SlayerGearPlease {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int input2;
		int n = 0;
		int c = 0;
		for (int i = 0; i < input; i++) 
		{
			input = sc.nextInt();
			input2 = sc.nextInt();
			if ((input * input2) > c) 
			{
				c = input * input2;
			}
		}
		input = sc.nextInt();
		for (int i = 0; i < input; i++) 
		{
			input = sc.nextInt();
			input2 = sc.nextInt();
			if ((input * input2) > n) 
			{
				n = input * input2;
			}
		}
		
		if (n < c) 
			System.out.println("Casper");
		else if (n > c)
			System.out.println("Natalie");
		else 
			System.out.println("Tie");
	}

}
