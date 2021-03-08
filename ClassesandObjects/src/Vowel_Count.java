import java.util.Scanner;

public class Vowel_Count {

	public static void main(String[] args) {
		//1)Take a string input from user and find the count of vowels in it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String n = sc.nextLine();
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
					|| n.charAt(i) == 'u' || n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I'
					|| n.charAt(i) == 'O' || n.charAt(i) == 'U')
				count++;	
		}
		System.out.format("%d vowels in string", count);
		sc.close();
	}
}