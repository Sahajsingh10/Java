
public class CheckingAccount extends BankAccount {
	public static final int FEE = 15;
	
	public CheckingAccount(String name, int amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if  (amount <= super.getBalance())
		{
			amount = amount + FEE;
			super.withdraw(amount);
		}
		
		return completed;
	}
	
	
	

}
