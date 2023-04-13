package PriorityQueue101;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue101 {

	//FIFO data structure
	//with the highest priorities first before elements with lower priority
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Double> queue = new PriorityQueue();
		queue.offer(55.5);
		queue.offer(44.4);
		queue.offer(77.7);
		queue.offer(88.88);
		
		//queue puts in ascending order
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		//use Collections.reverseOrder to put in descending order
		Queue<Double> queueReverse = new PriorityQueue<>(Collections.reverseOrder());
		queueReverse.offer(55.5);
		queueReverse.offer(44.4);
		queueReverse.offer(77.7);
		queueReverse.offer(88.88);
		
		
		while(!queueReverse.isEmpty()) {
			System.out.println(queueReverse.poll());
		}
		

		Queue<String> string = new PriorityQueue();
		string.offer("A");
		string.offer("B");
		string.offer("+");
		string.offer("HE");
		string.offer("DE");
		
		while(!string.isEmpty()) {
			System.out.println(string.poll());
		}
		
		Queue<String> stringReverse = new PriorityQueue<>(Collections.reverseOrder());
		stringReverse.offer("A");
		stringReverse.offer("+");
		stringReverse.offer("B");
		stringReverse.offer("HE");
		stringReverse.offer("DE");
		
		while(!stringReverse.isEmpty()) {
			System.out.println(stringReverse.poll());
		}
		
	}

}
