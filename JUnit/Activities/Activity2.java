package JunitActivities;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Activity2 {

	@Test
	void notEnoughFunds() {
		BankAccount acc = new BankAccount(9);
		//assert
		assertThrows(NotEnoughFundsException.class,()-> acc.withdraw(10));
	}
	@Test
	void enoughFunds() {
	    // Create an object for BankAccount class
	    BankAccount account = new BankAccount(100);

	    // Assertion for no exceptions
	    assertDoesNotThrow(() -> account.withdraw(100));
	}
}
