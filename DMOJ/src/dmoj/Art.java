package dmoj;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Art {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//new arraylists to store the x and y values
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		String input[] = new String[n*2 - 1];
		int numbers = 0;
		sc.nextLine();
		for(int i = 0; n > i; i++) 
		{
			
			input = sc.nextLine().split(",");
			//System.out.println(input[i]);
			//x.add(sc.nextInt());
			//y.add(sc.nextInt());
		}
		
		
	}

}
