package dmoj;
import java.util.*;
import java.util.ArrayList;

import java.util.Scanner;

public class CCC2021S3 {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] variables = new long [3][n]; 
		ArrayList<Long> p = new ArrayList<Long>();
		ArrayList<Long> w = new ArrayList<Long>();
		ArrayList<Long> d = new ArrayList<Long>();
		String input;
		for (int i = 0; i < n; i++) 
		{
			p.add(sc.nextLong());
			w.add(sc.nextLong());
			d.add(sc.nextLong());
		}
		ArrayList<Long> p2 = (ArrayList<Long>)p.clone();
		Collections.sort(p2);
		long min = p2.get(0);
		long minclone = min;
		long max = p2.get(n-1);
		long result = 0;
		long best = 0;
		while (min < max) 
		{
			for (int i = 0; i < n; i++) 
			{
				if (min < p.get(i) && p.get(i) - min > d.get(i)) 
				{
					result += (((p.get(i) - d.get(i)) - min) * w.get(i));
				}
				if (min > p.get(i) && (min - p.get(i)) > d.get(i))
					result += (min - (p.get(i) + d.get(i))) * w.get(i);
			}
			if (min == minclone)
				best = result;
			if (result < best && result > -1) 
			{
				best = result;
			}
			result = 0;
			min++;
		}
		System.out.println((int)best);
		
		
	}

}
