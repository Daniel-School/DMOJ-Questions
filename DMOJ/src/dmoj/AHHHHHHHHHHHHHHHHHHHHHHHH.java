package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class AHHHHHHHHHHHHHHHHHHHHHHHH {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] hill = new char[323][128];
		String input = " ";
		char in = ' ';
		
		for (int i = 0; i < 323; i++) 
		{
			input = br.readLine();
			for (int y = 0; y < 31; y++) 
			{
				in = input.charAt(y);
				hill[i][y] = in;
				hill[i][y*2] = in;
				hill[i][y*3] = in;
				hill[i][y*4] = in;
			}
			
		}
		
	}

}
