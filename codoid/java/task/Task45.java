package codoid.java.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task45 {
	
//	Iterate the map values using lambda expression
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		map.forEach((k,v)-> System.out.println(k+" = "+v));
	}

}
