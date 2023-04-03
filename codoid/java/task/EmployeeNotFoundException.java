package codoid.java.task;

public class EmployeeNotFoundException extends Exception {
	public String getMessage() {
		String msg = "Employee not found in Unit 1";
		return msg;
		
	}
}
