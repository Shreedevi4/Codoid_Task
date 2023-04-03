package codoid.java.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Task27 {
//	Write a Java program to read and write a file?

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Shree Devi\\"
				+ "Desktop\\Codoid tasks\\Java Tasks\\note.txt");
		java.util.List<String> read1 = FileUtils.readLines(f);
		for (String s : read1) {
			System.out.println(s);
		}
		FileUtils.write(f, ". Thankyou", true);
		java.util.List<String> read2 = FileUtils.readLines(f);
		for (String s : read2) {
			System.out.println(s);
		}

	}
}
