package codoid.java.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task33 {
//	Implement a program to merge two Arrays
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		l1.add(9);
		l1.add(8);
		l1.add(7);
		l1.add(6);
		l.addAll(l1);
		System.out.println(l);
		
	}
	
}
