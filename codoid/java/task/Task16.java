package codoid.java.task;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
//	How to sort array in java?
	
	
	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {  
			for (int j = i + 1; j < arr.length; j++){  
				int tmp = 0;  
				if (arr[i] > arr[j]){  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}
			System.out.println(arr[i]);  
		}  
	}
	
	public static void usingArraysSort(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

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
		Task16.sortArray(arr);
		Task16.usingArraysSort(arr);
	}

	}


