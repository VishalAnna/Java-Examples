package javapractice;

public class BasicsStringOperations {

	public static void main(String[] args) {
		String str1 ="Hello";
		String str2 = "VISHal";
		
		
		//concat
		String result = str1 + " " + str2;
	    System.out.println("Concatenation of two string str1 & str2=  " + result);
	    
	    //length
	    System.out.println("Length of a String= "+ str1.length() + " & "+ str2.length());
	    
	    //Char at index
	    System.out.println("Char at index 1 for both string are  " + str1.charAt(1) + " & " + str2.charAt(1));
	    
	    //Substring
	    System.out.println("Substring of str2 from index 3 : " + str2.substring(3));
	    
	    //Comparision 
	    System.out.println("str1 equals 'Hello' : " + str1.equals("Hell"));
	    System.out.println("Str1 equal ignore case 'Hello' : "  + str1.equalsIgnoreCase("Hello"));
	    
	    //searching
	    System.out.println("Index of 'e' in str1 : " + str1.indexOf('l'));
	    System.out.println("Conatin 'ish' in str2: " + str2.contains("ish"));
	    
	    //Case conversion 
	    System.out.println("Uppercase Str: " + str1.toUpperCase());
	    System.out.println("Lowercase str2: " + str2.toLowerCase());
	    
	    //tRIMMING 
	    String str3 = "                 trim Me       ";
	    System.out.println("Trimmed Str3 : " + str3.trim() + " ' ");
	    
	    //replacement
	    System.out.println("Replace 'l'  with 'p' in str1: " +str1.replace('l', 'p')  );

	}
	
	

}
