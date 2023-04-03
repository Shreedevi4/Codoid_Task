package codoid.java.task;

public class Task42 {
	//	Implement Exception Handling without Catch block

	public static void main(String[] args) {
		String str = null;
		try
		{
			if (str.equals("str"))
				System.out.println("True");
			else
				System.out.println("False");
		}finally {
			System.out.println("Tried without catch");
		}
	}
}
