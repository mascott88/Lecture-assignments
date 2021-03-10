package arrays;

import java.util.Scanner;

public class ArrayAssignment3 {

	public static void main(String[] args) {
		// 3)Take an array input and find the sum of all even numbers.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		System.out.println("Sum of Even numbers -");
		int sumEvens = 0;
		int x = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sumEvens+=i;
			}
		}
		System.out.println(sumEvens);
	}
}