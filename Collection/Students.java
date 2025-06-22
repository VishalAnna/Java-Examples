package Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class Students {
	String name;
	int age;
	
public Students(String name, int age) {
	this.name = name;
	this.age = age;
}
public String toString() {
	return name + " ( " + age + ")";
}

public class CustomerArrayListLab {
	public static void main(String[] args) {
		ArrayList<Students> Students = new ArrayList<>();
		
		//add students
		Students.add(new Students("Alice", 20));
		Students.add(new Students("Bob", 22));
		Students.add(new Students("Charlie", 19));
		
		System.out.println("Original List: ");
		Students.forEach(System.out::println);
		
		//sort by age using Comparator
		
		Students.sort(Comparator.comparingInt(s -> s.age));
		
		System.out.println("\nSorted by age");
		Students.forEach(System.out::println);
		
		
	}
	}

}
