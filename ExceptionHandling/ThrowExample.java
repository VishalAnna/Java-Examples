package ExceptionHandling;

public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(10); 
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        checkAge(20); 
    }
}
