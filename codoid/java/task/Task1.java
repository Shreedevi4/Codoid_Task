package codoid.java.task;
import java.util.Scanner;

public class Task1 {
	
//Write a Java program to create and throw custom exceptions
	public void Search(){
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
//		String id = "7654321";
		if(id.startsWith("87")) {
			System.out.println("Employee Present");
		}else {
			try {
				throw new EmployeeNotFoundException();
			}
			catch(EmployeeNotFoundException e){
				e.printStackTrace();
			}
			finally {
				System.out.println("Close Database");
			}
		}
	}
	public static void main(String[] args) {
		Task1 t = new Task1();
		t.Search();
	}
}
