package QueueDataStructure;

import java.util.LinkedList;
import java.util.Queue;


public class Queue101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue is a FIFO data structure. FIrst in first out, 
		//A collection designed for holding elements prior to processing
		//Linear data structure
		
		// add  = enqueue, offer()
		// remove = dequeue, poll()
		// peek()
		
		
		Queue<String> queue = new LinkedList<String>();

		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Harold"));
		
		
		
	}

}
