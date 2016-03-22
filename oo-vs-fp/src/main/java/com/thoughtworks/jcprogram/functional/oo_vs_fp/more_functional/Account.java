package com.thoughtworks.jcprogram.functional.oo_vs_fp.more_functional;

public class Account {
    private final double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account deposit(double amount) {
        return new Account(balance + amount);
    }

    public Balance balance() {
        return new Balance(balance);
    }
}
