import java.util.LinkedList;

public class Queue {

	public static void main(String args[]) {
		
		LinkedList<Integer> qu = new LinkedList<>();
		
		qu.add(0,20); //creating
		qu.add(1,44);
		qu.add(2,5);
		qu.add(3,444);
		qu.add(4,4);
		qu.add(5,21);
		System.out.println("Before Insertion");
		for(Integer x : qu) {
			System.out.print(x + " ");
		}		
		int ele = 10;
		int pos = 5;	
		qu.add(pos,ele); // updating		
		qu.add(pos-1, ele);// inserting
		System.out.println("\n\nAfter Insertion");
		for(Integer x : qu) {
			System.out.print(x + " ");
		}		
		int delpos1 = 3;
		qu.remove(delpos1); //deleting
		System.out.println("\n\nAfter Deletion from positon " + delpos1);
		for(Integer x : qu) {
			System.out.print(x + " ");
		}		
		int ele2 = 213;
		int ele3 = 81;
		int pos2 = 4;
		int pos3 = 5;
		qu.add(21); //creating
		qu.add(pos2, ele2); //updating
		qu.add(pos2, ele2); // inserting
		qu.add(pos3, ele3); // inserting
		System.out.println("\n\nAfter Insertion");
		for(int x : qu) {
			System.out.print(x + " ");
		}		
		int delpos2 = 3;
		qu.remove(delpos2); //deleting
		System.out.println("\n\nAfter Deletion from positon " + delpos2);
		for (int x : qu) {
			System.out.print(x + " ");
		}
	}
}