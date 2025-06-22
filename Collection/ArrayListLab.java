package Collection;

import java.util.ArrayList;

public class ArrayListLab {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println("Initial list: " + fruits);

		
		//at specific position 
		
		fruits.add(2,"Mango");
		System.out.println("Ater insertion: " + fruits);
		
		//access
		System.out.println("Element at index 3: " + fruits.get(3));
		
		//Update 
		fruits.set(0, "Pineapple");
		System.out.println("After update: " + fruits );
		
		//remove
		fruits.remove("Mango");
		fruits.remove(0);
		System.out.println("After remove : " + fruits);
		
		
		//check if exists
		System.out.println("Contains Mango: " + fruits.contains("Orange") );
		
		//get size
		System.out.println("Size of list: " + fruits.size());
		
		//clear list
		fruits.clear();
		System.out.println("After clear: " + fruits + ", is empty ?" + fruits.isEmpty());
	
		

	}

}
