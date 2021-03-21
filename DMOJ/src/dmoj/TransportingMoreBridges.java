package dmoj;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TransportingMoreBridges {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean bridgeBroken = false;
		int trainWeight = 0;
		int maxTrains = 0;
		
		int maxWeight = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] trains = new int[n];
		
		
		for (int i = 0; i < n; i++) 
		{
			trains[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < 3; i++) 
		{

			trainWeight += trains[i];

			if (trainWeight > maxWeight) 
			{
				maxTrains = i;
				bridgeBroken = true;
				break;
			}
		}
		
		trainWeight = 0;
		
		for (int i = 0; i < n; i++) 
		{
			if (bridgeBroken == true) break;
			try
			{
			trainWeight = trains[i] + trains[i + 1] + trains[i + 2] + trains[i+3];
			}
			catch(Exception e)
			{
			    maxTrains = i+3;
			    break;
			}
			if (trainWeight > maxWeight) 
			{
				maxTrains = i + 3;
				break;
			}
			trainWeight = 0;
		}
		
		System.out.println(maxTrains);
		
	}

}
