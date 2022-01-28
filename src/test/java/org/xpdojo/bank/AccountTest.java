package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	public void initialAccount_shouldHaveZeroBalance() {
        Account account = Account.emptyAccount();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAccount_withNonZeroAmount() {
        int amountToDeposit = 10;
        Account account = Account.emptyAccount();
        account.deposit(amountToDeposit);
        assertThat(account.balance()).isEqualTo(amountToDeposit);
    }

}
