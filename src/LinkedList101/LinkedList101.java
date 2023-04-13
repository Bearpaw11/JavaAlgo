package LinkedList101;

import java.util.LinkedList;

public class LinkedList101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist= new LinkedList<String>();
		
		linkedlist.offer("A");
		linkedlist.offer("B");
		linkedlist.offer("C");
		linkedlist.offer("D");
		linkedlist.offer("F");
		
		linkedlist.add(4, "E");
		
		System.out.println(linkedlist);
		linkedlist.remove("E");
		System.out.println(linkedlist);
		System.out.println(linkedlist.indexOf("F"));
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.getLast());
		
	}

}
