
public class CheckingsBankAccount extends BankAccount {
	private int transactionsCounter;
	
	public CheckingsBankAccount(String n, double b) {
		super(n, b);
		transactionsCounter = 0;
	}
	
	public void printAccount() {
		super.printAccount();
		System.out.println("\tTransactions this Month: " + transactionsCounter);
	}	
	
	public void increaseBalance(int am) {
		if (transactionsCounter < 3) {
			transactionsCounter++;
			super.increaseBalance(am);
		} else {
			System.out.println("\n=================================================");
			System.out.println("\tMax number of transactions is reached!");
			System.out.println("\n=================================================");
		}
	}

	public void decreaseBalance(int am) {
		if (transactionsCounter < 3) {
			transactionsCounter++;
			super.decreaseBalance(am);
		} else {
			System.out.println("\n=================================================");
			System.out.println("\tMax number of transactions is reached!");
			System.out.println("\n=================================================");
		}
	}
	
	public void endOfMonthUpdate() {
		transactionsCounter = 0;
		System.out.println("\n=================================================");
		System.out.println("\tNumber of Transactions Updated for: " + owner);
		System.out.println("\n=================================================");
	}	

}
