package MethodsPractice;

public class Reactangle {

	    double length;
	    double width;

	    public Reactangle() {
	        this.length = 1.0; 
	        this.width = 1.0; 
	    }

	    // Constructor for square
	    
	    public Reactangle(double side) {
	        this.length = side;  
	        this.width = side; 
	    }

	    // Constructor for rectangle
	    
	    public Reactangle(double length, double width) {
	        this.length = length; 
	        this.width = width; 
	    }

	    public double calculateArea() {
	        return length * width; 
	    }

	    public static void main(String[] args) {
	        Reactangle rect1 = new Reactangle();  
	        Reactangle rect2 = new Reactangle(5.0);  
	        Reactangle rect3 = new Reactangle(4.0, 6.0);  

	        System.out.println("Area 1: " + rect1.calculateArea()); 
	        System.out.println("Area 2: " + rect2.calculateArea());  
	        System.out.println("Area 3: " + rect3.calculateArea()); 
	    }
	}


