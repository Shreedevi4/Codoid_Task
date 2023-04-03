package codoid.java.task;

import java.util.Scanner;

public class Task53 {
//	Write a Java Program to find whether a string
//	or number is palindrome or not.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		String str2="";
		for (int i = str.length()-1; i >=0; i--) {
			str2=str2+str.charAt(i);
		}
		if(str2.equals(str)) {
			System.out.println("The given string is a Palindrome");
		}else System.out.println("The given string is not a Palindrome");
	}

}
