package javapractice;
public class person {

	    String name;
	    int age;

	    public person(String name, int age)
	    {
	        this.name = name;
	        
	        this.age = age;
	    }

	    // Copy constructor
	    public person(person original)
	    {
	        this.name = original.name; 
	        
	        this.age = original.age; 
	    }

	    public static void main(String[] args) 
	    {
	        person person1 = new person("Vishal", 25); 
	        person person2 = new person(person1);  

	        System.out.println("Person 1: " + person1.name + ", " + person1.age); 
	        System.out.println("Person 2: " + person2.name + ", " + person2.age);  

	        // Change person1 to show they're different objects
	        person1.name = "Robert"; 

	        System.out.println("\nAfter modification:");
	        System.out.println("Person 1: " + person1.name + ", " + person1.age); 
	        System.out.println("Person 2: " + person2.name + ", " + person2.age); 
	    }
	}


