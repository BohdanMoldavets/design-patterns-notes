package org.moldavets.model;

public abstract class WithdrawableAccount extends Account {

    public void withdraw(int amount) {
        super.balance -= amount;
    }
}
