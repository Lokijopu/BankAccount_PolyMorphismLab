/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class SavingsAccount extends BankAccount{

	private double intRate;
	private static double MIN_BAL;
	private static double MIN_BAL_FEE;
	SavingsAccount(String n, double b, double r, double mb, double mbf) {
		super(n, b);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	
	SavingsAccount(String n, double r, double mb, double mbf) {
		super(n, 0);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	
	public void withdraw(double amt) {
		try {
			if (this.getBalance() > amt) {
				this.withdraw(amt);
		}
		}
		catch (IllegalArgumentException e){
			
		}
	}
	
	public void transfer(BankAccount other, double amt) {
		
	}
	
	public void addInterest() {
		this.deposit(this.getBalance() * intRate); 
	}
	public void endOfMonthUpdate() {
		this.addInterest();
	}
	
}
