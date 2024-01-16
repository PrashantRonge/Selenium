package example;

public class Find_duplicate {

	public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 9, 5};

	        System.out.println("Duplicate elements in the array are:");
	        // Check for duplicates using nested loops
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    System.out.println(array[j]);
	                }
	            }
	        }
	}

}
