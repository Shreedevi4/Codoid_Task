package codoid.java.task;

public class Task12 {

//	"Write a program to generate the following output in java?
//	*
//	**
//	****
//	*****
//	******"
	public static void main(String[] args) {
		int n=6;
		for (int i =1; i <=n; i++) {
			if(i==3) continue;
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
