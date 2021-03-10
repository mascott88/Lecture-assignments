package arrays;

public class ArrayAssignment6 {

	public static void main(String[] args) {
		// 6)Perform CRUD operations on Array
		int ar[] = new int[8];
		ar[0] = 20;
		ar[1] = 44;
		ar[2] = 5;
		ar[3] = 444;
		int n = 4; // use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

		int ele = 100;
		int pos = 5;
		for (int i = n; i > pos - 1; i--) {
			ar[i] = ar[i - 1]; // updating
		}
		ar[pos - 1] = ele; // inserting
		n++;

		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

		int delpos = 2;
		for (int i = delpos - 1; i < n; i++) {
			ar[i] = ar[i + 1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon " + delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		int ele2 = 213;
		int ele3 = 81;
		int pos2 = 5;
		int pos3 = 6;
		for (int i = n; i > pos2 - 1; i--) {
			ar[i] = ar[i - 1]; // updating
		}
		ar[pos2 - 1] = ele2; // inserting
		n++;
		ar[pos3 - 1] = ele3; // inserting
		n++;

		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		int delpos2 = 3;
		for (int i = delpos2 - 1; i < n; i++) {
			ar[i] = ar[i + 1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon " + delpos2);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}