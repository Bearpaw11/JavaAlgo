package arrayList;

import java.util.ArrayList;

public class arrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> NewIntList = new ArrayList<>();
		NewIntList.add(10);
		NewIntList.add(20);
		NewIntList.add(30);
		NewIntList.add(40);
		System.out.println(NewIntList);
		NewIntList.add(0, 100);
		System.out.println(NewIntList);
		NewIntList.remove(0);
		System.out.println(NewIntList);
		System.out.println(NewIntList.contains(500));
		System.out.println(NewIntList.size());

	}

}
