package BuildAnArray;

public class Array {
	private int[] items;
	private int count;
	
	//constructor
	public Array(int length) {
	items = new int[length];
	}
	
	
	//print
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	
	//Insert
	public void Insert(int number) {
		if(items.length == count) {
			int [] items2 = new int[count*2];
			for (int i =0; i<items.length; i++) {
				items2[i] = items[i]; 
			}
			items = items2;
		}
		
		items[count ++] = number;
	}
	
	
	//removeAt
	public void removeAt(int index) {
		for(int i = index; i <= count; i ++) {
			items[i] = items[i +1];
		}
		count --;
	}
	
	//indexof
	
	public int indexof(int number) {

		for (int i = 0; i < count; i++) {
			if (items[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
}
