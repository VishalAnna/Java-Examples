package MethodsPractice;

public class car {

	    String make;
	    String model;
	    int year;
	    String color;

	    // Most detailed constructor
	    public car(String make, String model, int year, String color) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	    }

	    // Chain to main constructor with default color
	    
	    public car(String make, String model, int year) {
	        this(make, model, year, "Black"); 
	    }

	    // Chain with just make and model
	    public car(String make, String model) {
	        this(make, model, 2023);  
	    }

	    public void displayInfo() {
	        System.out.println(year + " " + make + " " + model + ", Color: " + color);
	    }

	    public static void main(String[] args) {
	        car car1 = new car("Toyota", "Camry", 2022, "Blue");  
	        car car2 = new car("Honda", "Accord", 2021); 
	        car car3 = new car("Ford", "Mustang");  

	        car1.displayInfo();
	        car2.displayInfo();
	        car3.displayInfo();
	    }
	}

