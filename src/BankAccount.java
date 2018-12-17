/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public abstract class BankAccount {
	private static int nextAccNum;
	private String name;
	private int acctNum;
	private double balance;
	public BankAccount(String n) {
		name = n;
		acctNum = nextAccNum;
		balance = 0;
	}
	public BankAccount(String n, double b) {
		name = n;
		acctNum = nextAccNum;
		balance = b;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}
	public void withdraw(double amt) {
		balance = balance - amt;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public abstract void endofMonthUpdate();
	
	public void transfer(BankAccount other, double amt) {
		withdraw(amt);
		other.deposit(amt);
	}
	
	public String toString() {
		return Integer.toString(acctNum) + "\t" + name + "\t$" + Double.toString(balance); 
	}
	
	
	
	
}
