package MethodsPractice;

public class AreaCalculation {

	    public static double calculateArea (double length, double width) {
	        return length * width;
	    }

	    public static void main(String[] args) {
	        System.out.println("Area of  rectangle: " + calculateArea(3.9, 5.1));
	        System.out.println("Area of  rectangle: " + calculateArea (7.3, 3.1));
	    }
	}
