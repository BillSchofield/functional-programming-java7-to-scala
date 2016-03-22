package com.thoughtworks.jcprogram.functional.oo_vs_fp.more_functional;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(100.0).deposit(50.0);
        Balance balance = account.balance();
        balance.report(System.out);
    }
}
