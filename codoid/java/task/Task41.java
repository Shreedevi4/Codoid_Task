package codoid.java.task;

import java.util.Scanner;

public class Task41 {
//	swap two numbers without using temporary variable
	
	public static void swap(int a, int b) {
			a=a+b;
			b=a-b;
			a=a-b;		
		System.out.println("After Swapping, a = "+a+", b = "+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Integer: ");
		int b = sc.nextInt();
	
		System.out.println("a = "+a+", b = "+b);
		
		Task41.swap(a, b);
	}

}
