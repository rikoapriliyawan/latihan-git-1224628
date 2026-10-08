import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount();

        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();

        account.deposit(100.0);

        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testMultipleDeposit() {
        BankAccount account = new BankAccount();

        account.deposit(100.0);
        account.deposit(50.0);

        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();

        account.deposit(100.0);
        account.withdraw(40.0);

        assertEquals(60.0, account.getBalance());
    }

    @Test
    void testNegativeDepositRejected() {
        BankAccount account = new BankAccount();

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-1.0));
    }

    @Test
    void testNegativeWithdrawRejected() {
        BankAccount account = new BankAccount();

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(-1.0));
    }

    @Test
    void testWithdrawMoreThanBalanceRejected() {
        BankAccount account = new BankAccount();

        account.deposit(50.0);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(60.0));
    }
}