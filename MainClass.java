
public class MainClass  {

	public static void main(String[] args) {
		// Create a new instance of bank
		Bank b = new Bank("UoM Bank");
		// Create a new savings account, and add it in the bank's list
		b.createAccount(new SavingsBankAccount("Ganousi", 5000, 0.05));
		// Create a new checkings account, and add it in the bank's list
		b.createAccount(new CheckingsBankAccount("Ampatzoglou", 1000));
		// Create a new savings account, and add it in the bank's list
		b.createAccount(new SavingsBankAccount("Papadopoulos", 10000, 0.08));
		
		// Prints all accounts
		b.printAllAccounts();
		
		// Add an amount to a specific account
		b.deposit("Ampatzoglou", 2000);
		b.deposit("Panousi", 4000);
		b.withdrawal("Panousi", 2000);
		b.deposit("Panousi", 4000);
		b.deposit("Panousi", 4000);
		b.deposit("Panousi", 4000);
		b.withdrawal("Papadopoulos", 5000);
		b.withdrawal("Papadopoulos", 6000);

		// Prints all accounts
		b.printAllAccounts();
		
		// Update on end of month
		b.endOfMonthUpdate();
		
		// Prints all accounts
		b.printAllAccounts();		
		
	}

}
