package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class AAAAAAAAAAAAAAAAAAAAAAAAAA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float testMark;
		float assignmentMark;
		float projectMark;
		float quizMark;
		float total;
		int pass = 0;
		
		float[] marks = new float[3];
		while (sc.hasNext()) 
		{
			float test = sc.nextFloat();
			float assignment = sc.nextFloat();
			float project = sc.nextFloat();
			float quiz = sc.nextFloat();

			int students = sc.nextInt();


			for (int x = 0; x < students; x++) 
			{
				for (int i = 0; i < 4; i++) 
				{
					marks[i] = Float.parseFloat(sc.next());
				}
				testMark = marks[0] * test;
				assignmentMark = marks[1] * assignment;
				projectMark = marks[2] * project;
				quizMark = marks[3] * quiz;
				total = testMark + assignmentMark + projectMark + quizMark;
				if (total >= 50.0) 
				{
					pass += 1;
				}
				
				
			}
			
			System.out.println(pass);
			
			
		}
	}

}
