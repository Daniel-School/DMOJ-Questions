package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class DarcysDebilitatingDemands {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		int a;
		int b;
		int c;
		for (int i = 0; i < t; i++) 
		{
			n = Integer.parseInt(br.readLine());
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());

			if (n > c) 
			{
				if(n > b + c) 
				{

					if (n - (b+c) <= a)
					{
						a = n - (b+c);
						System.out.println(a + " " + b + " " + c);
					}
					else
						System.out.printl	n(-1);
				}
				else
				{
					b = n - c;
					System.out.println("0 " + b + " " + c);
				}
			}
			else 
			{
				c = n;
				System.out.println("0 0 " + c);
			}

		}

	}

}