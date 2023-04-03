package codoid.java.task;

public class Task26 {
//	Write a Java Program to print the below output:
//	* 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567
	
	public static void main(String[] args) {
		int n=7;
		for (int i = 1; i <=n; i++) {
			System.out.print(" * ");
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			
		}
	}

}
