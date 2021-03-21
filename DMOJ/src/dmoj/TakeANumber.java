package dmoj;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class TakeANumber {

	public static void main(String[] args) throws IOException, NullPointerException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int studentLate = 0;
		int studentLeft = 0;
		String input = "";
		
		while (input != "EOF") 
		{
			input = br.readLine();
			if (input.equals("TAKE")) 
			{
				studentLate += 1;
				studentLeft += 1;
				number++;
				if (number > 999) number = 1;
			}
			else if (input.equals("SERVE")) 
			{
				studentLeft -= 1;
			}
			else if (input.equals("CLOSE"))
			{
				System.out.println(studentLate + " " + studentLeft + " " + number);
				studentLate = 0;
				studentLeft = 0;
			}
		}
		
		
	}

}
