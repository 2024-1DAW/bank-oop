package org.ies.bank.components;

import org.ies.bank.model.Customer;

public class BankAppWithErrors {
    private final BankReade bankReader;

    public BankApp2(BankReade bankReader) {
        bankReader = bankReader;
    }

    public void run() {

        bankReader.read();


        Customer account = bank.findAccount("ES0001");
        if(account != null) {
            account.showInfo();
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }
}
