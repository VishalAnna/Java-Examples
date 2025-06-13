package JavaNewPracticeCodes;

public class PrimeChecker {
	    public static boolean Prime(int num) {
	        if (num <= 1) {
	        	return false;
	        	}
	        for (int i = 2;
	        		i <= Math.sqrt(num); i++)
	        	 {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println("Is 7 prime ? " + Prime(7));
	        System.out.println("Is 10 prime ? " + Prime(10));
	    }
	}

