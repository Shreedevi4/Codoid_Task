package codoid.java.task;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task77 {
//	How to create LinkedHashSet program in java
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(0);
		
		set.forEach(s-> System.out.println(s));
		
	}
}
