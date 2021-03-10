package arrays;

import java.util.Scanner;

public class ArrayAssignment2 {
	
	public static void main(String[] args) {
		//Take an array input and find all the palindrome numbers from it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		System.out.println("Palindrome numbers -");
		
		int x = 10;		
		while (x <= n) {
			String input = Integer.toString(x).substring(0);
			String palindrome = reverse(input);
			if(input.equals(palindrome)) {
				System.out.println(x);
			}
			x++;
		}
	}
	public static String reverse(String input) {
		if (input.length() <= 1) {			
			return input;
		}
		return reverse(input.substring(1)) + input.substring(0, 1);
	}
}