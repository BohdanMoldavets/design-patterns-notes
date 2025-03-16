package org.moldavets.model;

public abstract class Account {

    protected int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
