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
	/**
	 * Creates a bank account with a default balance of 0.
	 * @param n		name
	 */
	public BankAccount(String n) {
		name = n;
		acctNum = nextAccNum;
		balance = 0;
	}
	/**
	 * Creates a bank account with an initial balance b.
	 * @param n		name
	 * @param b		balance
	 */
	public BankAccount(String n, double b) {
		name = n;
		acctNum = nextAccNum;
		balance = b;
	}
	/**
	 * Add a sum of money to the bank account.
	 * @param amt	amount
	 */
	public void deposit(double amt) {
		balance = balance + amt;
	}
	/**
	 * Withdraws a sum of money from the bank account.
	 * @param amt	amount
	 */
	public void withdraw(double amt) {
		balance = balance - amt;
	}
	/**
	 * Returns the owner's name associated with the bank account.
	 * @return		name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the bank account's current balance.
	 * @return		balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Abstract method that will be implemented in other classes either resetting the number of transactions or adding interest.
	 */
	public abstract void endOfMonthUpdate();
	/**
	 * Transfers money from one bank account to another.
	 * @param other		other bank account
	 * @param amt		amount
	 */
	public void transfer(BankAccount other, double amt) {
		this.withdraw(amt);
		other.deposit(amt);
	}
	/**
	 * Returns the account number.
	 * @return account number
	 */
	public int getAccountNumber() {
		return acctNum;
	}
	/**
	 * Returns a string showing the account number, name, and balance of the bank account.
	 */
	public String toString() {
		return Integer.toString(acctNum) + "\t" + name + "\t$" + Double.toString(balance);
	}
}