package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class AAA {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toLowerCase();
		String[] translate = new String[input.length()];
		
		for (int i = 0; i < input.length(); i++) 
		{
			switch (input.charAt(i)) 
			{
			case 'a':
				translate[i] = "@";
				break;
			case 'b':
				translate[i] = "8" ;
				break;
			case 'c':
				translate[i] = "(";
				break;
			case 'd':
				translate[i] = "|)" ;
				break;
			case 'e':
				translate[i] = "3";
				break;
			case 'f':
				translate[i] = "#";
				break;
			case 'g':
				translate[i] = "6" ;
				break;
			case 'h':
				translate[i] = "[-]" ;
				break;
			case 'i':
				translate[i] = "|" ;
				break;
			case 'j':
				translate[i] = "_|" ;
				break;
			case 'k':
				translate[i] = "|<" ;
				break;
			case 'l':
				translate[i] = "1" ;
				break;
			case 'm':
				translate[i] = "[]\\/[]";
				break;
			case 'n':
				translate[i] = "[]\\[]" ;
				break;
			case 'o':
				translate[i] = "0" ;
				break;
			case 'p':
				translate[i] = "|D" ;
				break;
			case 'q':
				translate[i] = "(,)" ;
				break;
			case 'r':
				translate[i] = "|Z" ;
				break;
			case 's':
				translate[i] = "\\$" ;
				break;
			case 't':
				translate[i] = "']['" ;
				break;
			case 'u':
				translate[i] = "|_|" ;
				break;
			case 'v':
				translate[i] = "\\/" ;
				break;
			case 'w':
				translate[i] = "\\/\\/" ;
				break;
			case 'x':
				translate[i] = "}{" ;
				break;
			case 'y':
				translate[i] = "`/" ;
				break;
			case 'z':
				translate[i] = "2" ;
				break;
			case ' ':
				translate[i] = " " ;
				break;
			case '?':
				translate[i] = "?";
				break;
			case '.':
				translate[i] = ".";
				break;
			case '!':
				translate[i] = "!";
				break;
			}
		}
		for (int i = 0; i < translate.length; i++) System.out.print(translate[i]);
	}

}
