
public class BankAccount implements Comparable <BankAccount>{
	// The attributes are protected, so as to be visible in the subclasses
	protected String owner;
	protected double balance;
	
	// Constructor for inherited attributes
	public BankAccount(String n, double b) {
		owner = n;
		balance = b;
	}
	
	public void printAccount() {
		System.out.println(owner + ", holds an account of: " + balance + "euros");		
	}

	public void increaseBalance(int am) {
		balance = balance + am;
		System.out.println("\n=================================================");
		System.out.println("\t Successfully added " + am + " euros to: " + owner);
		System.out.println("=================================================\n");
	}
	
	public boolean isOwner(String n) {
		return owner.equals(n);
	}

	public void endOfMonthUpdate() {}
		
	public void decreaseBalance(int am) {
		if (am < balance) {
			balance = balance - am;
			System.out.println("\n=================================================");
			System.out.println("\t Successfully removed " + am + " euros to: " + owner);
			System.out.println("=================================================\n");
		} else {
			System.out.println("\n=================================================");
			System.out.println("\t Note enought money to withdraw!!!");
			System.out.println("=================================================\n");			
		}
	}

	@Override
	public int compareTo(BankAccount o) {
		return this.owner.compareTo(o.owner);
	}
}
