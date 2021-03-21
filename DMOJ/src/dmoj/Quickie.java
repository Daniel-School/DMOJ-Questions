package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.math.*;
public class Quickie {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] array = new String[4];
		array = input.split(" ");
		Boolean yes;
		if (Integer.parseInt(array[0]) + Integer.parseInt(array[2]) == Integer.parseInt(array[4])) System.out.println("True");
		else System.out.println("False");
		
	}

}
