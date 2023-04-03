package codoid.java.task;

public class Task20 {
//	Write a Java program to show a NullPointerException.
	
	public static void main(String[] args) {
		String str = null;
        try
        {
            if (str.equals("str"))
                System.out.print("True");
            else
                System.out.print("False");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException occured, Kindly enter a valid String");
        }
	}
}
