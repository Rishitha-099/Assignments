package junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	long Idnum;
	double amount;
	double withDrawAmount;
	BankAccount Account;
	ByteArrayOutputStream outContent;
	
	void BeforeEach() {
		Account=new BankAccount(Idnum, amount);
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	}


	@Test
	void test1() {
		Idnum=9;
		amount = 50000;
		withDrawAmount=51000;
		Account = new BankAccount(Idnum,amount);
		assertThrows(InsufficientBalanceException.class,()->Account.WithDrawAmount(withDrawAmount));
		
	}
	@Test
	@DisplayName("Test2")
	void test2() {
		Idnum=15;
		amount = 65000;
		withDrawAmount=-40000;
		Account = new BankAccount(Idnum,amount);
		assertThrows(IllegalBankTransactionException.class,()->Account.WithDrawAmount(withDrawAmount));
		
	}
	@Test
	@DisplayName("Test3")
	void test3() {
		Idnum=21;
		amount=33000;
		withDrawAmount=15000;
		Account=new BankAccount(Idnum, amount);
		try {
			Account.WithDrawAmount(withDrawAmount);
		} catch (Exception e) {
			
		}
		String expected =String.valueOf(amount-withDrawAmount);
		assertEquals(expected, outContent.toString().trim());
	}
	@Test
	@DisplayName("Test4")
	void test4() {
		Idnum=36;
		amount=43000;
		withDrawAmount=20000;
		Account=new BankAccount(Idnum, amount);
		try {
			Account.WithDrawAmount(withDrawAmount);
		} catch (Exception e) {
			
		}
		String expected =String.valueOf(amount-withDrawAmount);
		assertEquals(expected, outContent.toString().trim());
	}



}
