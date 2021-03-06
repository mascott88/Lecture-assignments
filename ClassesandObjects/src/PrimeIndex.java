import java.util.Scanner;

public class PrimeIndex {

	public static void main(String[] args) {
		// 3)Take a string input and print alternate characters at prime index to uppercase.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String n = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n.length(); i++) {
			if (isPrime(i)) {
				sb.append(Character.toUpperCase(n.charAt(i)));
			}else {
				sb.append(n.charAt(i));
			}
		}
		//how to exclude whitespace primes in output ???
		System.out.println(sb.toString());
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