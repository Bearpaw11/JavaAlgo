package BuildAnArray;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array intitems = new Array(3);
		intitems.Insert(50);
		intitems.Insert(60);
		intitems.Insert(70);
		intitems.Insert(80);
		intitems.Insert(50);
		intitems.Insert(50);
		intitems.Insert(50);
		
		intitems.print();
		intitems.removeAt(2);
		intitems.print();
		System.out.println(intitems.indexof(100));
		System.out.println(intitems.indexof(50));
	}

}
