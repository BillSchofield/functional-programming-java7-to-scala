package com.thoughtworks.jcprogram.functional.oo_vs_fp.oo;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(100.0, System.out);
        account.deposit(50);
        account.reportBalance();
    }
}
