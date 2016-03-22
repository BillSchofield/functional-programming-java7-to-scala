package com.thoughtworks.jcprogram.functional.oo_vs_fp.more_functional;

import java.io.PrintStream;

public class Balance {
    private final double balance;

    public Balance(double balance) {
        this.balance = balance;
    }

    public void report(PrintStream printStream) {
        printStream.println(balance);
    }
}
