package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class PartyInvitation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		ArrayList <String> friends = new ArrayList<String>(k-1);
		ArrayList <String> stored = new ArrayList<String>(k-1);
		int rounds[] = new int[m];
		int arrayIndex = 0;

		for (int i = 0; i < k; i++) 
		{
			friends.add(Integer.toString(i+1));
		}

		//friends.remove("9");
		//for (int i = 0; i < friends.size(); i++) System.out.println(friends.get(i));

		for (int i = 0; i < m; i++) 
		{
			rounds[i] = Integer.parseInt(br.readLine());
		}

		//for (int i = 0; i < rounds.length;i++) System.out.println(rounds[i]);

		for (int i = 0; i < m; i++) 
		{

			while (1 == 1) 
			{
				arrayIndex += rounds[i];
				if (arrayIndex < friends.size() + 1) 
				{
					stored.add(friends.get(arrayIndex-1));
				}
				else break;
			}
			
			for (int y = 0; y < stored.size(); y++) 
			{
				friends.remove(stored.get(y));
			}
			stored.clear();
			arrayIndex = 0;
		}

		for (int i = 0; i < friends.size(); i++) System.out.println(friends.get(i));
	}

}
