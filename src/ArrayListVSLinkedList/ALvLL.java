package ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ALvLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		
		//Time to get first element
		//LL
//		startTime = System.nanoTime();
//		linkedList.get(0);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("LinkedList:\t" + elapsedTime + " ns");
//		
//		//AL
//		startTime = System.nanoTime();
//		arrayList.get(0);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("ArrayList:\t" + elapsedTime + " ns");
		
		
		//time to get element 500000
		//LL
//		startTime = System.nanoTime();
//		linkedList.get(500000);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("LinkedList:\t" + elapsedTime + " ns");
//		
//		//AL
//		startTime = System.nanoTime();
//		arrayList.get(500000);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("ArrayList:\t" + elapsedTime + " ns");
		
		
		//Time to get last element
		//LL
	
		
		
		//Time to insert at 0
//		startTime = System.nanoTime();
//		linkedList.add(0,999999);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("LinkedList:\t" + elapsedTime + " ns");
//		//AL
//		startTime = System.nanoTime();
//		arrayList.add(0,999999);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("ArrayList:\t" + elapsedTime + " ns");
		
		//Time to add in the middle
//		startTime = System.nanoTime();
//		linkedList.add(500000,999999);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("LinkedList:\t" + elapsedTime + " ns");
//		//AL
//		startTime = System.nanoTime();
//		arrayList.add(500000,999999);
//		endTime = System.nanoTime();
//		elapsedTime = endTime - startTime;
//		System.out.println("ArrayList:\t" + elapsedTime + " ns");
		
		//Time to add at the end
		startTime = System.nanoTime();
		linkedList.add(999999,999999);
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("LinkedList:\t" + elapsedTime + " ns");
		//AL
		startTime = System.nanoTime();
		arrayList.add(999999,999999);
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("ArrayList:\t" + elapsedTime + " ns");
		
		
		
	}

}
