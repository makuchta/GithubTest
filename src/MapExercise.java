// When I use TreeMap, the entries are printed in alphabetical order by name.
//
// When I use Map instead, I see the error "Cannot instantiate the type Map<String, String>
// This happens because Map is an interface, and an interface cannot be instantiated.
// A class like HashMap or TreeMap has to implement the interface, and the class can then
// be instantiated.

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class MapExercise {
		
	Map<String, String> courses = new TreeMap<String, String>();
	//Map<String, String> courses = new Map<String, String>();
	
	public void addCourses() {
		Scanner in = new Scanner(System.in);
		String name = "";
		String course = "";
		
		while (!name.equalsIgnoreCase("Q")) {
			System.out.print("Enter a student's name (or Q to quit): ");
			name = in.nextLine();
			if (!name.equalsIgnoreCase("Q")) {
				System.out.print("Enter the student's favorite course: ");
				course = in.nextLine();
				courses.put(name, course);
			}
		}
	}
	
	public void printCourses() {
		for (Entry<String, String> entry : courses.entrySet()) {
			System.out.println(entry.getKey() + " likes " + entry.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		MapExercise m = new MapExercise();
		m.addCourses();
		m.printCourses();
	}

}
