package arrayPractice;

public class Array {
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void print() {
		for (int i =0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	
	public void Insert(int Item) {
		//if array is full need to resize
		if (count == items.length) {
			//create a new array that is twice the size
			int[] newItems = new int[count * 2];
			//copy all existing items
			for (int i =0; i < count; i++) {
				newItems[i] = items[i];
			}
			
			items = newItems;
		}
		//set Items to this new array
		//add item at end of the array
		items[count ++] = Item;
		
	}
	
	public void removeAt(int index) {
		//validate the index
	    if(index < 0 || index >= count) 
			throw new IllegalArgumentException();
	    //shift the items to the left to fill the hole.
		for (int i = index; i < count; i++) {
			items[i] = items[i +1];
		}
		count--;
	}
	
	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item) {
				return i;
			};
		}
		return -1;
		
	}
	
}
