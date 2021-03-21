package dmoj;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Scanner;

public class WhichAlien {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ant = Integer.parseInt(br.readLine());
		int eye = Integer.parseInt(br.readLine());
		if (ant >= 3 & eye <= 4) 
		{
			System.out.println("TroyMartian");
		}
		
		if (ant <= 6 & eye >= 2) 
		{
			System.out.println("VladSaturnian");
		}
		
		if(ant <= 2 & eye <= 3) 
		{
			System.out.println("GraemeMercurian");
		}
	}

}
