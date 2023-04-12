package BuildLinkedList;

public class LLmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList newList = new LinkedList();
		newList.addLast(777);
		newList.print();
		newList.addFirst(5);
		newList.addFirst(50);
		newList.addFirst(500);
		newList.addFirst(5000);
		newList.print();
		newList.addFirst(50000);
		newList.print();
		newList.removeFirst();
		newList.print();
		newList.removeLast();
		newList.print();
		newList.addLast(500000000);
		newList.print();
	    System.out.println(newList.contains(500000000));
	    System.out.println(newList.Indexof(500000000));
		
	}

}
