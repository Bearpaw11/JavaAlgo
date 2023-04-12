package BuildLinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value= value;
		}
	}
	
	private Node first;
	private Node last;
	
	private boolean isEmpty() {
		return first == null;
	}
	
	private Node getPrevious(Node node) {
		Node current = first;
		while (current!= node) {
			if(current.next == node)return current;
			current = current.next;
		}
		return null;
	}
	
	public void removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(first == last) {
			first = last = null;
			return;
		}
		Node second = first.next;
		first.next = null;
		first = second;
	}
		
	public void addFirst(int Item) {
		Node node = new Node(Item);
		
		if(isEmpty()) {
			first = last = node;
		}else {
			node.next = first;
			first = node;
		}
			
	}
	
	//removelast
	public void removeLast(){
		if(isEmpty()) {
			return;
		}
		if(first == last) {
			first = last = null;
			return;
		}
		Node newLast = getPrevious(last);
		last = newLast;
		last.next = null;
		
	}
	
	public void addLast(int item) {
		
		Node node = new Node(item);
		if(isEmpty()) {
			first = last  = node;
			return;
		}
		last.next = node;
		last = node;
	}
	
	
	
	
	//removefirst
	
	public void print() {
		int index = 0;
		Node current = first;
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		while(current != null) {
			System.out.println(index + ":" + current.value);
			current = current.next;
			index ++;
		}
		System.out.println();
		return;
	}
	
	//contains
	public boolean contains(int doIExist) {
	if(Indexof(doIExist) != -1) return true;
		return false;
	}
	
	public int Indexof(int NeedIndexOf) {
		if(isEmpty()) {
			return -1;
		}
		int index = 0;
		Node current = first;
		while (current != null) {
		if(current.value == NeedIndexOf) {
				return index;
		}else{
			current = current.next;
			index ++;
		}
		}
		return -1;
		
	}
}
