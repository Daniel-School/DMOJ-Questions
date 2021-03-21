package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class AAAAAAAAAAAAAAAAAAA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String template = br.readLine();
		template.replace("-","");
		char uhh[] = new char[template.length()];
		for (int i = 0; i < template.length(); i++) 
		{
			uhh[i] = template.charAt(i);
		}
		int pages = Integer.parseInt(br.readLine());
		String input;
		for (int i = 0; i < pages; i++) 
		{
			input = br.readLine();
			for (int ii = 0; i < template.length(); i++) 
			{
				//if (input.(template.charAt(ii))) {}
				
			}
			if (input.contains(template)) 
			{
				System.out.println("yes");
			}
			else System.out.println("no");
		}
	}

}
