package ArrayOperations;

public class sortedarray {

	public static void main(String[] args) {
		// Search a number in a sorted array

		int[] arr = {00, 11, 22, 33, 44, 55, 66, 77, 88, 99};

		int searchNum = 22;
		int low = 0;
		int high = arr.length-1;

		while(low <= high) {

		    int mid = low + (high-low) / 2;

		    if(arr[mid] == searchNum) {
		        System.out.println("Number found " + arr[mid]);

		        break;
		    }
		    if(searchNum > arr[mid]) {
		        low = mid+1;
		    }else {

		        high = mid-1;

		    }

		} 

	}

}
