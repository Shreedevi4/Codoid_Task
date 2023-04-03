package codoid.java.task;

import java.util.Scanner;

public class Task36 {
//	Write a Java Program for Fibonacci series.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n = sc.nextInt();
		int fact = 1;
		while(n>0) {
			fact = fact*n;
			n=n-1;
		}
		System.out.println("Factorial of given number is "+fact);
	}

}
