package linkedListPractice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> LinkedListPractice = new LinkedList();
		LinkedListPractice.addLast(50);
		LinkedListPractice.addLast(40);
		LinkedListPractice.addLast(30);
		LinkedListPractice.addFirst(500);
		System.out.println(LinkedListPractice);
		LinkedListPractice.remove(30);
		System.out.println(LinkedListPractice);
	}

}
