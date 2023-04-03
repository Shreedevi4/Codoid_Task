package codoid.java.task;
import java.util.*;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class Task9 {
//	How to read a file in Java?
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Shree Devi\\Desktop\\"
				+ "Codoid tasks\\Java Tasks\\Note.txt");
	List<String> read = FileUtils.readLines(f);
		for (String s : read) {
			System.out.println(s);
		}
	}
}
