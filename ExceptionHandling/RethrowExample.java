package ExceptionHandling;

public class RethrowExample {
    public static void processInput(String input) throws NumberFormatException {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Square of " + number + " is " + (number * number));
        } catch (NumberFormatException e) {
            System.out.println("First attempt failed - trying alternative...");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            processInput("123"); // valid
            processInput("abc"); // invalid
        } catch (NumberFormatException e) {
            System.out.println("Final error: Input must be a valid integer");
        }
    }
}
