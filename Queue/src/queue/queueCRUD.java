package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueCRUD {

	public static void main(String[] args) {

		Queue<Integer> qu = new LinkedList<>();

		qu.add(20);		 //creating
		qu.add(44);
		qu.add(5);
		qu.add(444);
		qu.add(4);
		qu.add(21);
		System.out.println("Before Insertion");
		for (Integer x : qu) {
			System.out.print(x + " ");
		}
		
		int ele = 444;		//updating
		int newEle  = 555;
		int pos = 0;
		while (!(qu.element() == ele)) { 
				qu.add(qu.poll());
				pos++;			
			}
		qu.poll();
		qu.add(newEle);
		while (pos-1 > 0){     
			qu.add(qu.poll());
			pos--;
		}
		System.out.println("\n\nAfter Updating");
		for (Integer x : qu) {
			System.out.print(x + " ");
		}
		
		int ele2 = 10;		// inserting
		qu.add(ele2);		
		System.out.println("\n\nAfter Insertion");
		for (Integer x : qu) {
			System.out.print(x + " ");
		}

		int delEle = 555;		//deleting
		int pos2 = 0;
		while (!(qu.element() == delEle)) { 	
			qu.add(qu.poll());
			pos2++;			
		}
		qu.poll();
		while (pos2 > 0){    		
			qu.add(qu.poll());
			pos2--;
		}
		System.out.println("\n\nAfter Deletion");
		for (Integer x : qu) {
			System.out.print(x + " ");
		}
	}
}