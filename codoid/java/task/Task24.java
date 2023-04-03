package codoid.java.task;

public class Task24 {
/*	Write a Java program to print stars using for loop, 
	where the number of stars printed should be 
	equal to the row number? */
	
	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
