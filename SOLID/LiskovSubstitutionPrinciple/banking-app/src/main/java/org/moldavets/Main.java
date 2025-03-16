package org.moldavets;

import org.moldavets.model.SavingsAccount;
import org.moldavets.model.WithdrawableAccount;

public class Main {
    public static void main(String[] args) {
        WithdrawableAccount withdrawableAccount = new SavingsAccount();

        withdrawableAccount.deposit(2000);
        withdrawableAccount.withdraw(1900);
        System.out.println(withdrawableAccount.getBalance());

    }
}