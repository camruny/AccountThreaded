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
public final class Withdrawal extends Transaction	{
	private final double amount;
	private final Account account;

	public Withdrawal(int tNumber, Account acct,double amt)	{
		super(tNumber);
		amount = amt;
		account = acct;
                makeTransaction();
	}

        @Override
	public void makeTransaction()	{
            double currentBalance = account.getAccountBalance();
            if(currentBalance < amount) {
                System.out.println("There are not enough funds to process your request - TRANSACTION CANCELLED");
            }
            else    {
                currentBalance = currentBalance - amount;
                account.setBalance(currentBalance);
                System.out.println("Withdrawing $" + amount + " from Account " + account.getAccountNumber());
            }
	}
}
