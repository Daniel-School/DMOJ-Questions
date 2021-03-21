package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class GenevaConfection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tests = Integer.parseInt(br.readLine());
		Stack<Integer> cars = new Stack<Integer>();
		Stack<Integer> branch = new Stack<Integer>();
		Stack<Integer> lake = new Stack<Integer>();
		
		for(int i = 0; i < tests; i++) 
		{
			int carsNum = Integer.parseInt(br.readLine());
			int nextCar = 1;
			boolean yes = true;
			cars.clear();
			branch.clear();
			lake.clear();
			
			for (int x = 0; x < carsNum; x++) 
			{
				cars.push(Integer.parseInt(br.readLine()));
			}
			for (int x = 0; x < carsNum; x++) 
			{
				//System.out.println(cars.peek() + " AAA");
				if (cars.peek() == nextCar) 
				{
					lake.push(cars.pop());
					//System.out.println(cars.peek());
					//System.out.println(lake.peek());
					nextCar++;
				}
				else if (branch.isEmpty() && branch.peek() == nextCar) 
				{
					lake.push(branch.pop());
					nextCar++;
				}
				
				else 
				{
					branch.push(cars.pop());
				}		
			}
			
			
			for (int x = 0; x < branch.size() + 1; x++) 
			{
				if (branch.peek() == nextCar) 
				{
					lake.push(branch.pop());
					nextCar++;
				}
				else 
				{
					yes = false;
				}
			}
			
			if (yes == true) System.out.println("Y");
			else System.out.println("N");
			
			//for (int y = 0; y < branch.size()+1; y++) System.out.println(branch.pop());
		}
	}

}
