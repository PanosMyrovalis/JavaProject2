
public class SavingsBankAccount extends BankAccount {
	// Additional attribute, necessary only for Savings
	private double interestRate;
	
	public SavingsBankAccount(String n, double b, double i) {
		super(n, b);   // Inits the inherited attributes through the construtor of the superclass
		interestRate = i; // Inits the "local" attributes
	}
	
	public void printAccount() {
		super.printAccount();
		System.out.println("\tInterest Rate: " + interestRate);
	}
	
	public void endOfMonthUpdate() {
		balance = balance * (1 + interestRate);
		System.out.println("\n=================================================");
		System.out.println("\tInterest has been added to the balance of:" + owner);
		System.out.println("\n=================================================");
	}	
	
}
