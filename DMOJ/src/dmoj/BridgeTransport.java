package dmoj;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BridgeTransport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxWeight = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] trains = new int[n];
		int maxTrains = 0;
		int what = 0;
		int currentWeight = 0;

		for (int i = 0; i < n; i++) 
		{
			trains[i] = Integer.parseInt(br.readLine());
		}
		

		for (int i = 0; i < n; i++) 
		{
			if (trains[i] > maxWeight) 
			{
				what = i;
				i = n;
				maxWeight = 0;
			}
			for (int y = 0; y < n; y++) 
			{
				currentWeight += trains[i+y];
				if (currentWeight <= maxWeight) 
				{
					maxTrains++;
				}
				if (currentWeight > maxWeight) 
				{
					if (maxTrains > what) 
					{
						what = maxTrains;
					}
					
					maxTrains = 0;
					y = n;
				}
			}
		}
		
		System.out.println(what);

		for(int i = 0; i < trains.length; i++) System.out.println(trains[i]);

	}

}
