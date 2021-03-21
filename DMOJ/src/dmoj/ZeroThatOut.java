package dmoj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ZeroThatOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> money = new Stack<Integer>();
		int sum = 0;
		
		
		for (int i = 0; i < k; i++) 
		{
			money.push(Integer.parseInt(br.readLine()));
			if(money.peek() == 0) 
			{
				money.pop();
				money.pop();
			}
		}
		
		for (int i = 0; i < money.size(); i++) 
		{
			sum += money.get(i);
		}
		
		System.out.println(sum);
	}

}
