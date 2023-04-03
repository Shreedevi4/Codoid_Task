package codoid.java.task;

import java.util.Scanner;

public class Task28 {
//	Implement factorial using recursion

	static int factorial(int n){    
		if (n == 0)    
			return 1;    
		else    
			return(n * factorial(n-1));    
	}    
	public static void main(String args[]){  
		int fact=1;  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		fact = factorial(num);   
		System.out.println("Factorial of "+num+" is: "+fact);    
	}  
}
