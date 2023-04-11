package arrayPractice;

public class Main {

	public static void main(String[] args) {
		Array numbers = new Array(2);
		numbers.Insert(10);
		numbers.Insert(10);
		numbers.Insert(30);
		//numbers.removeAt(1);
		System.out.println(numbers.indexOf(10));
		numbers.print();
	}

}
