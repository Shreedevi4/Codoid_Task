package codoid.java.task;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task15 {
//	How to remove duplicate elements from an array in Java?
	
	public static void removeDuplicate(int[] arr) {
		 LinkedHashSet<Integer> set = new LinkedHashSet<>();

     for (int i = 0; i < arr.length; i++)
         set.add(arr[i]);
     System.out.print(set);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values: ");
		for (int i = 0; i <n; i++) {
			int a = sc.nextInt();
			arr[i]=a;
		}
		Task15.removeDuplicate(arr);
		
	}

}
