package dmoj;
import java.util.Scanner;

public class ISBN
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first, second, third;
		first = scan.nextInt();
		second = scan.nextInt();
		third = scan.nextInt();
		second = second * 3;
		third = third + second + first + 91;
		System.out.println("The 1-3-sum is " + third);
	}
}