package codoid.java.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task32 {
//	Program to find duplicate values for ArrayList
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			String l = sc.nextLine();
			list.add(l);
			}
		Set<String> set = new HashSet<>();
		for (String s : list) {
			if(set.add(s)==false) {
				System.out.println(s);
			}
		}
	}
}
