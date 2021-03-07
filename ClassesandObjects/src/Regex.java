import java.util.Scanner;

public class Regex {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		// 1) write validation for passport number, SSN, DL, and any other ID you have
		System.out.println("Enter 9-digit Passport#:");
		String passportNum = sc.nextLine();
		while (!passportNum.matches("[0-9]{9}")) {
			System.out.println("Invalid, please try again:");
			passportNum = sc.nextLine();
		}
		System.out.println("Passport Valid\n");

		System.out.println("Enter SSN (xxx-xx-xxxx):");
		String ssnNum = sc.nextLine();
		while (!ssnNum.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("SSN Invalid, please try again:");
			ssnNum = sc.nextLine();
		}
		System.out.println("SSN Valid\n");

		System.out.println("Enter Ohio Driver's License#:");
		// ohio driver's license format: 1Alpha+4-8Numeric || 2Alpha+3-7Numeric || 8Numeric
		String dlNum = sc.nextLine();
		String ohioDL = "[A-Za-z]{4,8}|[A-Za-z]{2}[0-9]{3,7}|[0-9]{8}";
		while(!dlNum.matches(ohioDL)) {
			System.out.println("Driver's License Invalid");
			dlNum = sc.nextLine();			
		} 
		System.out.println("Driver's License Valid\n");	
		sc.close();
	}
}