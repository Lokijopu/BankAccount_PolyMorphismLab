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
				break;
			case "savings":
				System.out.print("name:\t");
				String name2 = in.nextLine();
				System.out.print("balance:\t");
				double bal2 = in.nextDouble();
				System.out.print("rate:\t");
				double rate = in.nextDouble();
				System.out.print("minumum balance:\t");
				double mb = in.nextDouble();
				System.out.print("minumum balance fee:\t");
				double mbf = in.nextDouble();
				accounts.add(new SavingsAccount(name2, bal2, rate, mb, mbf));
				break;
			default:
				System.out.print("checking or savings?");
				str2 = in.nextLine().toLowerCase().trim();
				break;
			}
			System.out.print("Would you like to \nadd an account \nmake a transaction \nterminate the program\n" );
			str1 = in.nextLine().toLowerCase().trim();
		case "make a transaction":
			System.out.print("Would you like to \nwithdraw\ndeposit\ntransfer\nget account numbers");
			String str3 = in.nextLine().toLowerCase().trim();
			switch (str3) {
			case "withdraw":
				break;
			case "deposit":
				break;
			case "transfer":
				break;
			case "get account numbers":
				break;
			default: 
				System.out.print("Would you like to \nwithdraw\ndeposit\ntransfer\nget account numbers");
				str3 = in.nextLine().toLowerCase().trim();
				break;
			}
		case "terminate the program":
			terminated = true;
			break;
		default:
			System.out.print("Would you like to \nadd an account \nmake a transaction \nterminate the program\n");
			str2 = in.nextLine();
			break;
		}
		if (terminated) {
			System.out.println("Have a nice day.");
		}
	}
	}
