package MethodsPractice;

public class stringreverse {

	    public static String reverseString (String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) { // The loop condition was corrected from the original PDF (i>=8 to i>=0)
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println("Reverse of 'hello': " + reverseString("hello"));
	        System.out.println("Reverse of 'Java': " + reverseString("Java"));
	    }
	}

