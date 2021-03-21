package dmoj;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
public class AmeriCanadian {
	 public static void main(String[] args)
	 {
		 
		 Scanner sc = new Scanner(System.in);
		 char vowel;
		 char o;
		 char r;
		 String word = sc.next();
		 //System.out.println(word.charAt((word.length() - 1)));
		 //System.out.println(word.substring(0, word.length()-2) + "our");
		 while(!word.equals("quit!")) 
		 {
			 if (word.length() > 4) 
			 {
				 vowel = word.charAt(word.length() - 3);
				 o = word.charAt(word.length() - 2);
				 r = word.charAt(word.length() - 1);
				 System.out.println(o + " " + r + " "+ vowel);
				 if (vowel != 'a' && vowel != 'e' && vowel != 'i' && vowel != 'o' && vowel != 'u' && vowel != 'y' && o == 'o' && r == 'r') 
				 {
					 System.out.println(word.substring(0, word.length()-2) + "our");
				 }
				 
				 else System.out.println(word);
			 }
			 else 
			 {
				 System.out.println(word);
			 }
			 word = sc.next();
			 
		 }
		 
		 
		 
		 
	 }
}
