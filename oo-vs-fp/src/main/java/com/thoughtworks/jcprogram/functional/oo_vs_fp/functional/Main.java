package com.thoughtworks.jcprogram.functional.oo_vs_fp.functional;

public class Main {

    public static void main(String[] args) {
        report(balance(afterDepositOf(50.0, accountStartingWith(100.0))));
    }

    private static void report(double balance) {
        System.out.println(balance);
    }

    private static double balance(Account account) {
        return account.balance;
    }

    private static Account afterDepositOf(double amount, Account account) {
        return new Account(amount + account.balance);
    }

    private static Account accountStartingWith(double balance) {
        return new Account(balance);
    }
}
