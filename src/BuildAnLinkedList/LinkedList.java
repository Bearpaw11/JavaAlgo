package BuildAnLinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
	}
	
	private Node first;
	private Node last;
	public boolean isEmpty() {
		return first == null;
	}
	
	private Node getPrevious(Node node) {
		var current = first;
		while(current !=null) {
			if(current.next == node) return current;
			current = current.next;
		}
		return null;
	}
	
	//addFirst
	public void addFirst(int item) {
	var node = new Node(item);
		
		if (isEmpty()) {
			first = last = node;
		}else {
			node.next = first;
			first = node;
		}
	}
	
	//addLast
	public void addLast(int item) {
		var node = new Node(item);
		
		if (isEmpty()) {
			first = last = node;
		}
		else {
			last.next = node;
			last = node;
		}
	}
	//deleteFirst
	public void deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		if(first == last) {
			first = last = null;
			return;
		}
		
		var second = first.next;
		first.next = null;
		first = second;
			
	}
	//deleteLast
	
	public void deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		if(first == last) {
			first = last = null;
			return;
		}
	 var previous = getPrevious(last);
	 last = previous;
	 last.next = null;
	}
	
	//contains
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	//indexOf
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while(current !=null) {
			if(current.value == item) return index;
			current = current.next;
			index ++;
		}
		return -1;
	}
	
	//print list
	public void print() {
		var current = first;
		int index = 0;
		while(current !=null) {
			System.out.println(index + " : " + current.value);
			index ++;
			current = current.next;
		}
	}

}
