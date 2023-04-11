package BuildAnLinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		System.out.println(list.indexOf(40));
		list.print();
		System.out.println(list.contains(50));
		list.deleteFirst();
		list.print();
		list.deleteLast();
		list.print();
	}

}
