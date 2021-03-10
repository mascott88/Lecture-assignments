package loops;

public class LoopAssignment1 {
	public static void main(String[] args) {
		
		//1)Try all the loops by yourself with some use case of your own
		System.out.println("For Loop:");
		for (int i = 0; i < 5; i++) {			
			System.out.println("wow " + i);
		}
		System.out.print("\n");
		System.out.println("While Loop:");
		int j=0;
		while (j <= 5) {
			System.out.println(j+ " wow");
			j++;
		}
		System.out.print("\n");
		System.out.println("doWhile Loop:");
		int k = 5;
		do {
			System.out.println("wow " + k);
			k--;
		} while (k >= 0);

	}
}