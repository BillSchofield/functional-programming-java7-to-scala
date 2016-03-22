package com.thoughtworks.jcprogram.functional.oo_vs_fp.oo;

import java.io.PrintStream;

public class Account {
    private double balance;
    private PrintStream printStream;

    public Account(double balance, PrintStream printStream) {
        this.balance = balance;
        this.printStream = printStream;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void reportBalance() {
        printStream.println(balance);
    }
}
