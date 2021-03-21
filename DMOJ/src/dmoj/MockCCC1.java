package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ArrayList;

public class MockCCC1 {

	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String y = br.readLine();
		String s = br.readLine();
		add(s,y);

		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
	}

	
	
	public static void add (String str, String letter) 
	{
		String result;
		for (int i = 0; i < letter.length(); i++) 
		{
			for (int y = 0; y < str.length(); y++) 
			{
				//replacing
				result = str.substring(0, y) + letter.charAt(i) + str.substring(y);
				int insertionPoint = Collections.binarySearch(list, result);
				if (insertionPoint < 0 && !result.equals(str)) 
				{
					list.add(Math.abs(insertionPoint) - 1,result);
				}
				
				//adding
				result = str.substring(0,y) + letter.charAt(i) + str.substring(y + 1);
				insertionPoint = Collections.binarySearch(list, result);
				if (insertionPoint < 0 && !result.equals(str)) 
				{
					list.add(Math.abs(insertionPoint) - 1,result);
				}
				
				//deleting
				StringBuilder sb = new StringBuilder(str);
				char c = str.charAt(y);
				if (letter.contains(String.valueOf(c)))
				{
					sb.deleteCharAt(y);
					result = sb.toString();
					insertionPoint = Collections.binarySearch(list, result);
					if (insertionPoint < 0 && !result.equals(str)) 
					{
						list.add(Math.abs(insertionPoint) - 1,result);
					}
				}
			}
		}


		//adding a letter at the end
		for (int i = 0; i < letter.length(); i++) 
		{
			char c = letter.charAt(i);
			result = str.concat(String.valueOf(c));
			int insertionPoint = Collections.binarySearch(list, result);
			if (insertionPoint < 0 && !result.equals(str)) 
			{
				list.add(Math.abs(insertionPoint) - 1,result);
			}
		}
	}

}
