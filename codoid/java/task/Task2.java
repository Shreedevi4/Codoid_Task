package codoid.java.task;

import java.util.Scanner;

public class Task2 {

	//How do we reverse a string?
	public static String reverseString(String s) {
		String rev ="";
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			rev = rev+c;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed: ");
		String s = sc.nextLine();
		System.out.println("Reversed String : " + Task2.reverseString(s));
	}
}
