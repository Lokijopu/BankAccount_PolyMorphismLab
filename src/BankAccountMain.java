import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class BankAccountMain {

	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(new CheckingAccount("Mr. Ellis", 100, 30, 1, 10));
		accounts.add(new CheckingAccount("Mrs. Ellis",30,1,10));
		accounts.add(new SavingsAccount("Mr. Ellis", 500, .025, 200,5));
		accounts.add(new SavingsAccount("Mrs. Ellis", .025, 200,5));
		Scanner in = new Scanner(System.in);
		boolean terminated = false;
		System.out.print("Would you like to \nadd an account \nmake a transaction \nterminate the program\n" );
		String str1 = in.nextLine().toLowerCase().trim();
		switch (str1) {
		case "add an account":
			System.out.print("checking or savings?");
			String str2 = in.nextLine().toLowerCase().trim();
			switch(str2) {
			case "checking":
				System.out.print("name:\t");
				String name = in.nextLine().trim();
				System.out.print("balance:\t");
				double bal = in.nextDouble();
				System.out.print("overdraft fee:\t");
				double odf = in.nextDouble();
				System.out.print("transaction fee:\t");
				double tf = in.nextDouble();
				System.out.print("number of free transactions:\t");
				int numTrans = in.nextInt();
				accounts.add(new CheckingAccount(name, bal, odf, tf, numTrans));
			case "savings":
				System.out.print("name\t");
				name = in.nextLine();
				System.out.print("balance\t");
				bal = in.nextDouble();
				System.out.print("rate:\t");
				double rate = in.nextDouble();
				System.out.print("minumum balance:\t");
				double mb = in.nextDouble();
				System.out.print("minumum balance fee:\t");
				double mbf = in.nextDouble();
				accounts.add(new SavingsAccount(name, bal, rate, mb, mbf));
			default:
				System.out.print("checking or savings?");
				str2 = in.nextLine().toLowerCase().trim();
			}
		case "make a transaction":
			System.out.print("Would you like to \nwithdraw\ndeposit\ntransfer\nget account numbers");
			String str3 = in.nextLine().toLowerCase().trim();
			switch (str3) {
			case "withdraw":
			case "deposit":
			case "transfer":
			case "getaccountnumbers":
			default: 
				System.out.print("Would you like to \nwithdraw\ndeposit\ntransfer\nget account numbers");
				str3 = in.nextLine().toLowerCase().trim();
			}
		case "terminate the program":
			terminated = true;
		default: {
			System.out.print("Would you like to \nadd an account \nmake a transaction \nterminate the program\n");
			str2 = in.nextLine();
		}
		if (terminated) {
			System.out.println("Have a nice day.");
		}
	}
	}
}
