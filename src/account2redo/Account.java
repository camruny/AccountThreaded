package account2redo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class Account {
    private int accountNumber;
    private double accountBalance;
    
    public Account(int acctNumber, double acctBalance)    {
        accountNumber = acctNumber;
        accountBalance = acctBalance;
    }
    
    public int getAccountNumber(){return accountNumber;}
    
    public double getAccountBalance(){return accountBalance;}
    
    public void setBalance(double informedBalance){
        accountBalance = informedBalance;
        //System.out.println("Account Balance = $" + accountBalance);
    }
}
