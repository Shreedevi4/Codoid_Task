package codoid.java.task;

public class Task7 {
//	Write a program to demonstrate the method overloading
//	by changing data types?
	public void empDetails(String name) {
		System.out.println("Employee Name : "+name);
	}
	public void empDetails(int id) {
		System.out.println("Employee id : "+id);
		}
	public void empDetails(long phno) {
		System.out.println("Employee PhNo : "+phno);
	}
	public static void main(String[] args) {
		Task7 t = new Task7();
		t.empDetails("Codoid");
		t.empDetails( 54321);
		t.empDetails(9876543211l);
	}

}
