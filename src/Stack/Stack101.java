package Stack;

import java.util.Stack;


public class Stack101 {

	public static void main(String[] args) {
		
		//stack = LIFO data structure, list in first out
		// stores objects into a sort of "vertical tower"
		//push() to add to the top
		// pop() to remove from the top
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack);
		int pops = stack.pop();
		System.out.println(stack);
		System.out.println(pops);
		System.out.println(stack.search(20));

	}

}
