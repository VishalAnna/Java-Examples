package MethodsPractice;

public class grandparents {
	class Grandparent {
	    void grandparentMethod() {
	        System.out.println("Grandparent's method"); // Prints a message for grandparent's method.
	    }
	}

	class Parent extends Grandparent { // Parent inherits from Grandparent
	    void parentMethod() {
	        System.out.println("Parent's method"); // Prints a message for parent's method.
	    }
	}

	class Child extends Parent { // Child inherits from Parent
	    void childMethod() {
	        System.out.println("Child's method"); // Prints a message for child's method.
	    }
	}

}
