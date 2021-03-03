public class LoopAssignment4 {

	public static void main(String[] args) {
		/*
		 * 4)Find the sum of all even numbers between 1 and 100, also find sum of all
		 * odd numbers between 1 and 100 and print the results and print which is
		 * largest among them(between evensum and oddsum)
		 */
		int largestEven = 0;
		int largestOdd = 0;
		int evenSum = 0;
		int oddSum = 0;
		int[] evenNumbersArr = new int[101];
		int[] oddNumbersArr = new int[101];
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNumbersArr[i] = i; 				
				if (evenNumbersArr[i] > largestEven) 
					largestEven = evenNumbersArr[i];
				evenSum += i;
			} else {
				oddNumbersArr[i] = i;				
				if (oddNumbersArr[i] > largestOdd) 
					largestOdd = oddNumbersArr[i];
				oddSum += i;
			}			
		}
		
		System.out.println("Largest even number: " + largestEven);
		System.out.println("Largest odd number: " + largestOdd);
		
		if (oddSum > evenSum){
			System.out.format("Odd number sum: %d, is larger than Even number sum: %d%n", oddSum, evenSum);
		}else {
			System.out.format("Even number sum: %d, is larger than Odd number sum: %d.%n", evenSum, oddSum);
		}
	}}