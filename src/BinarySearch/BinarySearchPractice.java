package BinarySearch;

import java.util.Arrays;

public class BinarySearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[1000000];
		int target = 445684;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
//		for(int i =0; i< array.length; i++) {
//			System.out.println(array[i]);
//		}
		int index = binarySearch(array, target);
		
		if(index >= 0) {
			System.out.println("Index of " + target + " is " + index);
		}
		else if (index == -1){
			System.out.println("Index of " + target + " not found");
		}
	}

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = (array.length) -1;
		
		//check middle index if equal to target...if so return index
		while(low <= high) {
			int middle =  low + (high - low) /2;
			int value = array[middle];
				
			System.out.println("Middle: " + value);	
		if(value == target) {
			return(middle);
			}
		else if(value < target) {
			low = middle +1;
		}
		else {
			high = middle -1;
		}
		}
		

		//if value is < target then do again from rest of array at higher index
		
		//if value > target then do again from rest of array at lower index
		return -1;
	
}

}
