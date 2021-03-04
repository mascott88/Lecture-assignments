public class LoopAssignment3 {
	
	public static void main(String[] args) {
		// 3)Find all the odd numbers between 100 and 199
		for (int i = 100; i < 200; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
	}
}
