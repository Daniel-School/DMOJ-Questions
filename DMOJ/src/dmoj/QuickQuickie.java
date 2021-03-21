package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class QuickQuickie {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if (a > c) System.out.println("Bob overdoses on day 1.");
		else if ((a/2 + b) > c) System.out.println("Bob overdoses on day 2.");
		else System.out.println("Bob never overdoses.");
	}

}
