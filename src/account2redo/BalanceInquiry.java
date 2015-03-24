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
public class BalanceInquiry extends Transaction {
    Account acct;
    
    BalanceInquiry(int transNumber, Account acct, double amt)    {
      super(transNumber);  
    }

    @Override
    public void makeTransaction() {
        acct.getAccountBalance();
        System.out.println("The balance of Account" + acct.getAccountNumber() + " is $" + acct.getAccountBalance());
    }
}
