package exceptions;

import java.util.Scanner;

public class ExceptionsMain {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter valid U.S. Passport id:");
		String passportNum = sc.nextLine();
		BusinessException x = new BusinessException();
		try {
			if (x.isValidPassportNumber(passportNum)) {
				System.out.println("Valid Passport#");
			}
		} catch (InvalidPassportException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter valid U.S. Driver's License#:");
		String dlNum = sc.nextLine();
		try {
			if (x.isValidDriversLicenseNumber(dlNum)) {
				System.out.println("Valid Driver's License#");
			}
		} catch (InvalidDriversLicenseException e) {
			System.out.println(e.getMessage());
		}
		sc.close();//how to close scanner after exception ??? finally ???
	}
}