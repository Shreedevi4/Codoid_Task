package codoid.java.task;

import java.util.Arrays;
import java.util.Scanner;

public class Task19 {
//	Write Java program that checks if two arrays 
//	contain the same elements.
	
	public static void arrayEqualOrNot(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

	}

	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array1: ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter array1 values: ");
		for (int i = 0; i <n1; i++) {
			int a = sc.nextInt();
			arr1[i]=a;
		}
		
		System.out.print("Enter size of array2: ");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter array2 values: ");
		for (int i = 0; i <n2; i++) {
			int a = sc.nextInt();
			arr2[i]=a;
		}
		
		Task19.arrayEqualOrNot(arr1, arr2);
    }
}
