import java.util.ArrayList;
import java.util.Collections;

public class Bank  {
	private String name;
	private ArrayList<BankAccount> accountList;
	
	public Bank(String n) {
		name = n;
		accountList = new ArrayList<BankAccount>();
	}
	
	// Adds a BankAccount in the list
	// Note: The object can be replaced by a Savings or Checkings object (when called)
	// This can substitute a BankAccount object due to the inheritance relationship
	public void createAccount(BankAccount ba) {
		accountList.add(ba);
	}

	public void printAllAccounts() {
		System.out.println("\n========= Bank Accounts for: " + name + " =============");
		// Iterates along the list and calls the corresponding printAccount method
		for (int i=0;i<accountList.size();i++) {
			// printAccount is called from the type of the object in position "i"
			accountList.get(i).printAccount();			
		}		
	}

	public void deposit(String o, int am) {
		
		Collections.sort(accountList);
		// Iterates along the list to find the account
		for (int i=0;i<accountList.size();i++) {
			if (accountList.get(i).isOwner(o)) {
				// Account found, increase balance
				// When object is Savings, the increaseBalance from BankAccount is called
				// since there is no increaseBalance in Savings
				// When object is Checkings, the increaseBalance from CheckingsBankAccount is called
				// since the BankAccount method is HIDDEN
				accountList.get(i).increaseBalance(am);	
			}
		}		
	}

	public void withdrawal(String o, int am) {
		// Iterates along the list to find the account
		for (int i=0;i<accountList.size();i++) {
			if (accountList.get(i).isOwner(o)) {
				// Account found, decrease balance
				accountList.get(i).decreaseBalance(am);	
			}
		}				
	}

	public void endOfMonthUpdate() {
		// Iterates along the list and perform monthly updates
		for (int i=0;i<accountList.size();i++) {
			accountList.get(i).endOfMonthUpdate();	
		}				
	}	
	
}
