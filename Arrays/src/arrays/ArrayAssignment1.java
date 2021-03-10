package arrays;

import java.util.Scanner;

public class ArrayAssignment1 {
	
	public static void main(String[] args) {
		// 1)Take an array input and find all the prime numbers from it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		System.out.println("Prime numbers -");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
	}
}