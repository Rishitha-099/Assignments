package exceptionhandling;

class insufficientbalanceException extends Exception{
	public insufficientbalanceException(String s)
	{
		super(s);
	}
}
class illegalbanktransactionException extends insufficientbalanceException
{
	public illegalbanktransactionException(String s) {
		super(s);
	}
}
class savingaccount{
	private final long id;
	private double balance;
	public savingaccount(long id,double balance) {
		this.id=id;
		this.balance=balance;
	};
	public double withdraw(double amount) throws RuntimeException{
		try {
			if(balance<amount) {
				throw new insufficientbalanceException("Insufficient balance in the account");
			}
			balance -= amount;
		}
		catch (insufficientbalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return balance;
	}
	public double deposit(double amount)throws RuntimeException{
		try {
			if(amount<=0) {
				throw new illegalbanktransactionException("The amount must be greater than 0");
			}
			balance -= amount;
		}
		catch (illegalbanktransactionException ez) {
			System.out.println(ez.getMessage());
			ez.printStackTrace();
		}
		finally {
			balance = balance;
		}
		return balance;
	}
	public double getBalance() {
		return balance;
	}
}
public class bank {

	public static void main(String[] args) {
		savingaccount r=new savingaccount(10,50000);
		r.deposit(2500);
		r.withdraw(1000);
		System.out.println(r.getBalance());
		

	}

}
