package codoid.java.task;

import java.util.Scanner;

public class Task13 {
//	How to find duplicate characters in a string in Java?
	
	public static String findDuplicate(String s) {
		char[] c = s.toCharArray();
		String dup = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					String st = Character.toString(s.charAt(i));
					if(!dup.contains(st)) {
						dup=dup +" "+st;
					}
					break;
				}
			}
		}
		return dup;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		System.out.println("Duplicates : "+Task13.findDuplicate(s));
	}
}
