package codoid.java.task;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task46 {
//	Iterate the Linkedlist values using lambda expression
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		int n = sc.nextInt();
		System.out.println("Enter names : ");
		List<String> name = new LinkedList<>();
		for (int i = 0; i <= n; i++) {
			String a = sc.nextLine();
			name.add(a);
		}
		name.forEach(a -> System.out.println(a));
	}


}
