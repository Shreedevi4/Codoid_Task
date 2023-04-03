package codoid.java.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
//Write a Program to remove duplicates in an ArrayList.
	public static void removeDuplicate(List<Integer> l) {
		Set<Integer> s = new HashSet<>(l);
		System.out.println("After removing duplicates : ");
		for (Integer val : s) {
			System.out.println(val);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list: ");
		int n = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			l.add(a);
		}
		Task4.removeDuplicate(l);
		
	}
}
