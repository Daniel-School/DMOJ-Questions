package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.math.*;

public class Factorial {

	public static int Recursion(BigInteger n, BigInteger k, BigInteger m, BigInteger loops)
	{
		BigInteger one = new BigInteger("1");
		BigInteger uno = new BigInteger("49");
		BigInteger zero = new BigInteger("0");
		System.out.print(loops + " ");
		System.out.print(n + " ");
		System.out.println(n.remainder(k.pow(m.intValue())));
		
		if (n.remainder(k.pow(m.intValue())).equals(zero)) 
		{
			return loops.intValue() - 1;
		}
		else 
		{
		n = n.multiply(loops);
		return Recursion(n,k,m,loops.add(one));
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 10; i++) 
		{
		String[] input = new String[1];
		input = br.readLine().split(" ");
		BigInteger k = new BigInteger(input[0]);
		BigInteger m = new BigInteger(input[1]);
		BigInteger uno = new BigInteger("1");
		System.out.println(Recursion(uno,k,m,uno));
		}
		//System.out.println(k + " " + m);
		

	}

}
