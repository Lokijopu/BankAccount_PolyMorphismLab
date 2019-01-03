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
		System.out.print("Would you like to \nadd an account \nmake a transaction \nterminate the program\n\t" );
		String str1 = in.nextLine().toLowerCase();
		while (!str1.equals("add an account") && !str1.equals(("make a transaction")) && !str1.equals(("terminate the program"))) {
			System.out.print("Would you like to \nadd an account \nmake a transaction \nterminate the program\nInput your choice exactly:\t" );
			str1 = in.nextLine();
		}
		if (str1.equals("add an account")) {
			System.out.print("checking or savings?");
			String str2 = in.nextLine().toLowerCase();
			while (!str2.equals("checking") && !str2.equals("saving")) {
				System.out.print("checking or savings?");
				str2 = in.nextLine().toLowerCase();
			}
			if (str2.equals("checking")) {
				System.out.print("name\t");
				String name = in.nextLine();
				System.out.print("balance\t");
				double bal = in.nextDouble();
			} else if (str2.equals("savings")) {
				System.out.print("name\t");
				String name = in.nextLine();
				System.out.print("balance\t");
				double bal = in.nextDouble();
			}
		} else if (str1.equals(("make a transaction"))) {
			System.out.println("2");
		} else if (str1.equals(("terminate the program"))) {
			System.out.println("Have a nice day.");
		} 
	}

}
