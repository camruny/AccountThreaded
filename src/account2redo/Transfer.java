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
public final class Transfer extends Transaction{
    Account fromAccount;
    Account toAccount;
    double transferAmt;

    public Transfer(int transNumber, Account moveFrom, Account moveTo, double amt) {
        super(transNumber);
        fromAccount = moveFrom;
        toAccount = moveTo;
        transferAmt = amt;
        makeTransaction();
    }

    @Override
    public void makeTransaction() {
        double toBalance;
        double fromBalance;
        
        
        
        toBalance = toAccount.getAccountBalance();
        fromBalance = fromAccount.getAccountBalance();
        
        if(fromBalance < transferAmt)   {
            System.out.println("There is not enough funds in Account: " + fromAccount.getAccountNumber() + " to process your request.");
        }
        else    {
        
            toBalance = toBalance + transferAmt;
            fromBalance = fromBalance - transferAmt;
        
            toAccount.setBalance(toBalance);
            fromAccount.setBalance(fromBalance);
            
            System.out.println("Transfering $" + transferAmt + " from Account " + fromAccount.getAccountNumber() + " to Account " + toAccount.getAccountNumber());
        }

    }
    
}
