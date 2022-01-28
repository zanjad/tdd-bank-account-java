package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	public void initialAccount_shouldHaveZeroBalance() {
        Account account = Account.emptyAccount();
        assertThat(account.balance()).isEqualTo(0);
    }
}
