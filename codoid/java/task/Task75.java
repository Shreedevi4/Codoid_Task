package codoid.java.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Task75 {

//	How to convert string to date in java program
	
	public static void main(String[] args) throws ParseException {
		String date = "Jan/02/2023";
		Date d = new SimpleDateFormat("MMM/dd/YYYY").parse(date);
		System.out.println(date + "\t"+ d);
	}
}
