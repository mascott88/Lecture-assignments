package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAssignment4 {

	public static void main(String[] args) {
		// 4)Take an array input and find the max value and min value from that array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int arr[] = new int[n];
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arrList.add(arr[i]);
		}
		max = Collections.max(arrList);
		min = Collections.min(arrList);
		System.out.println("Max. value in array: " + max);
		System.out.println("Min. value in array: " + min);
	}
}