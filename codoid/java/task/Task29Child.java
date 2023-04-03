package codoid.java.task;

public class Task29Child implements Task29Parent1,Task29Parent2{

	@Override
	public void test3() {
		System.out.println("Test 3 pass");		
	}

	@Override
	public void test1() {
		System.out.println("Test 1 pass");		
	}

	@Override
	public void test2() {
		System.out.println("Test 2 pass");		
	}
	public static void main(String[] args) {
		Task29Child c = new Task29Child();
		c.test1();
		c.test2();
		c.test3();
	}

}
