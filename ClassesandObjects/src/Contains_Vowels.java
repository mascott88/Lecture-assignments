import java.util.Scanner;

public class Contains_Vowels {
	
	public static void main(String[] args) {
		//2)Take a string input and print true if all vowels are present in it, else print false.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String n = sc.nextLine();
		if(n.toLowerCase().contains("a") && n.toLowerCase().contains("e") && n.toLowerCase().contains("i") && n.toLowerCase().contains("o") && n.toLowerCase().contains("u")){
			System.out.println("True: string contains all Vowels");
		}else {
			System.out.println("False: string does not contain all Vowels");
		}
	}
}
