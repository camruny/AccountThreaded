/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account2redo;

/**
 *
 * @author Cameron
 */
public final class Deposit extends Transaction {
    private final double originalBalance;
    private double newBalance;
    private final double transactionAmt;
    private final Account account;
    
    public Deposit(int transNumber, Account acct, double transAmt) {
        super(transNumber);
        originalBalance = acct.getAccountBalance();
        transactionAmt = transAmt;
        account = acct;
        makeTransaction();
    }

    @Override
    public void makeTransaction() {
        
        newBalance = originalBalance + transactionAmt;
        account.setBalance(newBalance);
        System.out.println("$" + transactionAmt + " deposited into account " + account.getAccountNumber());
    }
}
