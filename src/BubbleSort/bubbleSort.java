package BubbleSort;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yo[] = {9,5,6,0,7,3,4,8};
		
		bubbleSearch(yo);
		
		
		for(int i: yo) {
			System.out.print(i);
		}
	}

	private static void bubbleSearch(int[] yo) {
		// TODO Auto-generated method stub
		for(int i =0; i < yo.length -1; i++) {
			for(int j=0; j<yo.length -i -1; j++) {
				if(yo[j] < yo[j+1]) {
					int temp = yo[j];
					yo[j]= yo[j+1];
					yo[j+1] = temp;
				}
			}
		}
		
	}

}
