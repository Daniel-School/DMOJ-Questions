package dmoj;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class WhenYouEatYourSmarties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int orange = 0;
		int blue = 0;
		int green = 0;
		int yellow = 0;
		int pink = 0;
		int violet = 0;
		int brown = 0;
		int red = 0;
		int time = 0;
		String input = " ";

		for (int i = 0; i < 10; i++)
		{
			while (!input.equals("end of box")) 
			{
				input = br.readLine();
				if (input.equals("red")) red++;
				else if (input.equals("blue")) blue++;
				else if (input.equals("orange")) orange++;
				else if (input.equals("green")) green++;
				else if (input.equals("yellow")) yellow++;
				else if (input.equals("pink")) pink++;
				else if (input.equals("violet")) violet++;
				else if (input.equals("brown")) brown++;
			}

			while (red > 0) 
			{
				red--;
				time +=16;
			}
			while (blue > 0) 
			{
				blue -= 7;
				time +=13;
			}
			while (orange > 0) 
			{
				orange -= 7;
				time +=13;
			}
			while (green > 0) 
			{
				green -= 7;
				time +=13;
			}
			while (yellow > 0) 
			{
				yellow -= 7;
				time +=13;
			}
			while (pink > 0) 
			{
				pink -= 7;
				time +=13;
			}
			while (violet > 0) 
			{
				violet -= 7;
				time +=13;
			}
			while (brown > 0) 
			{
				brown -= 7;
				time +=13;
			}
			System.out.println(time);

		}
	}
}
