import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAssignment5 {

public static void main(String[] args) {
		//5)Take an array input and find the 2nd max value in that array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int arr[] = new int[n];
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int secondLargestNum = 0;
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arrList.add(arr[i]);
		}
		max = Collections.max(arrList);
		min = Collections.min(arrList);
		for (int j = 0; j < n; j++) {
			if (arr[j] > secondLargestNum && arr[j] < max)
				secondLargestNum = arr[j];
		}
		System.out.println("Second largest value in array: " + secondLargestNum);
	}
}
