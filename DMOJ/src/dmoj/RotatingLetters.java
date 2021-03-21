package dmoj;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RotatingLetters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		boolean yes = true;
		for (int i = 0; i < word.length(); i++) 
		{
			if (word.charAt(i) != 'I' || word.charAt(i) != 'O' || word.charAt(i) != 'S' || word.charAt(i) != 'H' || word.charAt(i) != 'Z' || word.charAt(i) != 'X' || word.charAt(i) != 'N') 
			{
				yes = false;
			}
		}
		
		if(yes) System.out.println("YES");
		else System.out.println("NO");
	}

}
