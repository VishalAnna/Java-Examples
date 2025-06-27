package Debugging;

public class NullPointerBug {
	
      public static void main(String[] args) {
	
       String message = null;
        if (message.length() > 0) { // 💥 NullPointerException
           System.out.println("Message is not empty");
    }
   }
}
