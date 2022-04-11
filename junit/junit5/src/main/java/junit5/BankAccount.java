package junit5;

public class BankAccount {
	long idnum;
	double balance;
	public BankAccount(long idnum, double balance) {
		this.idnum=idnum;
		this.balance=balance;
	}
	public void WithDrawAmount(double Amount) throws Exception{
		if(Amount>balance) {
			throw new InsufficientBalanceException("Insufficient balance in the account");
		}
		else if(Amount<-1) {
			throw new IllegalBankTransactionException("Illegal Bank Transaction");
		}
		else {
			System.out.println(balance-Amount);
		}
	}
	public void deposit(double Amount) {
		System.out.println(balance+Amount);
	}

}
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String message) {
		super(message);
	}
}

