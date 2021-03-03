

public class LoopsAssignment2 {
	
	public static void main(String args[]) {
		// 2)Print all the palindrome numbers between 100 and 999
		int x = 100;
		while (x < 1000) {
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