package dmoj;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class SearchingForStrings2 {

	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String needle = br.readLine();
		String haystack = br.readLine();

		permutation("", needle);
		
		int count = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if(haystack.contains(list.get(i))) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void permutation (String prefix, String str) 
	{
		//base case when a full permutation has been built
		if (str.length() == 0) 
		{
			int insertionPoint = Collections.binarySearch(list, prefix);
			if (insertionPoint < 0) 
			{
				list.add(Math.abs(insertionPoint) - 1,prefix);
			}

		}
		else 
		{
			//recursive case
			for (int i = 0; i < str.length(); i++) 
			{
				String prefix1 = prefix + str.charAt(i);
				String str1 = str.substring(0, i) + str.substring(i + 1);
				permutation(prefix1, str1);
			}
			
		}
	}

}
