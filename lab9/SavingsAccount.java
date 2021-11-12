
public class SavingsAccount extends BankAccount {
	public double rate = 2.5;
	public double savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		
	 accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	
			
		}
	public SavingsAccount(SavingsAccount old, double balance) {
		super(old,balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
		public void postInterest() {
			
		double amount = super.getBalance() * (rate / 100 * 12);
		super.deposit(amount);
		
	}
		public String getAccountNumber()
		{
			return accountNumber;
		}
		
	
	
	

}
