package codoid.java.task;

public class Task8 {
//	Write a program to demonstrate the method overloading 
//	by changing a number of arguments?
	public void empDetails(String name) {
		System.out.println("Employee Name : "+name);
	}
	public void empDetails(String email, int id, long phno) {
		System.out.println("Employee email : "+email);
		System.out.println("Employee id : "+id);
		System.out.println("Employee PhNo : "+phno);
	}
	public static void main(String[] args) {
		Task8 t = new Task8();
		t.empDetails("Codoid");
		t.empDetails("recruitment@codoid.com", 54321, 9876554321l);
	}

	
}
