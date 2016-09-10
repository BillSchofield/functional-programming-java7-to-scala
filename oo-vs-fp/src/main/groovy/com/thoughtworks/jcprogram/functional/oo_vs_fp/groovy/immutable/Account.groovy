package com.thoughtworks.jcprogram.functional.oo_vs_fp.groovy.immutable

import groovy.transform.TupleConstructor

@TupleConstructor
class Account {
    double balance;

    def deposit(BigDecimal amount) {
        return new Account(balance: balance + amount);
    }

    def reportBalance() {
        println balance;
    }
}
