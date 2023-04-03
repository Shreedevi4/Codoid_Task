package codoid.java.task;

import java.util.Scanner;

public class Task14 {
//	How to remove special characters from a string in java?
	
	public static String removeSpclChar(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>64 && str.charAt(i)<=122) {
				s =s+str.charAt(i);
			}
		}
		return s;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Task14.removeSpclChar(str));
	}

}
