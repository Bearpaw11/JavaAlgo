package interpolationSearch;

public class interpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
		int index = interpolationSearch(intArray, 512);
		if(index != -1) {
		System.out.println("Element found at index " + index);
		}else System.out.println("Element does not exist in intArray");
	}

	private static int interpolationSearch(int[] intArray, int value) {
		int high = intArray.length -1;
		int low = 0;
		
		while (value >= intArray[low] && value <= intArray[high] && low<= high){
			int probe = low + (high - low) * (value - intArray[low]) / (intArray[high] - intArray[low]);
			System.out.println("probe: " + probe);
			
			if(intArray[probe] == value) {
				return probe;
			}
			else if (intArray[probe] > value) {
				high = probe -1;
			}
			else {
				low = probe +1;
			}
		}
		
		return -1;
	}

}
