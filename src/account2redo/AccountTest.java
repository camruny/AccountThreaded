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
public class AccountTest  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acct1 = new Account(1, 100.00);
        Account acct2 = new Account(2, 300.00);
        Account acct3 = new Account(3, 200.00);
        Account acct4 = new Account(4, 400.00);
        Account acct5 = new Account(5, 150.00);
        
        
        Transaction [] t = new Transaction[15];
        //Deposits
        
        t[0] = new Deposit (1, acct1, 350.00);
        t[0].start();
        //System.out.println("Account 1 Balance: " + acct1.getAccountBalance());
        
        t[1] = new Deposit (2, acct2, 200.00);
        t[1].start();
        //System.out.println("Account 2 Balance: " + acct2.getAccountBalance());
        
        t[2] = new Deposit (3, acct3, 100.00);
        t[2].start();
        //System.out.println("Account 3 Balance: " + acct3.getAccountBalance());
        
        t[3] = new Deposit (4, acct4, 100.00);
        t[3].start();
        //System.out.println("Account 4 Balance: " + acct4.getAccountBalance());
        
        t[4] = new Deposit (5, acct5, 100.00);
        t[4].start();
        //System.out.println("Account 5 Balance: " + acct5.getAccountBalance());
        
        //Withdrawals
        //System.out.println("");
        //System.out.println("Withdrawals:");
        
        t[5] = new Withdrawal (6, acct1, 200.00);
        t[5].start();
        //System.out.println("Account 1 Balance: " + acct1.getAccountBalance());
        
        t[6] = new Withdrawal (7, acct2, 150.00);
        t[6].start();
        //System.out.println("Account 2 Balance: " + acct2.getAccountBalance());
        
        t[7] = new Withdrawal (8, acct3, 150.00);
        t[7].start();
        //System.out.println("Account 3 Balance: " + acct3.getAccountBalance());
        
        t[8] = new Withdrawal (9, acct4, 200.00);
        t[8].start();
        //System.out.println("Account 4 Balance: " + acct4.getAccountBalance());
        
        t[9] = new Withdrawal (10, acct5, 150.00);
        t[9].start();
        //System.out.println("Account 5 Balance: " + acct5.getAccountBalance());
        
        //Transfers
        //transferFrom, transferTo
        //System.out.println("");
        //System.out.println("Transfers:");
        
        t[10] = new Transfer(11, acct1, acct2, 100);
        t[10].start();
        //System.out.println("Account 1 Balance: " + acct1.getAccountBalance());
        //System.out.println("Account 2 Balance: " + acct2.getAccountBalance());
        //System.out.println("---------------------------");
        
        t[11] = new Transfer(12, acct2, acct3, 200);
        t[11].start();
        //System.out.println("Account 2 Balance: " + acct2.getAccountBalance());
        //System.out.println("Account 3 Balance: " + acct3.getAccountBalance());
        //System.out.println("---------------------------");
        
        t[12] = new Transfer(13, acct3, acct4, 200);
        t[12].start();
        //System.out.println("Account 3 Balance: " + acct3.getAccountBalance());
        //System.out.println("Account 4 Balance: " + acct4.getAccountBalance());
        //System.out.println("---------------------------");
        
        t[13] = new Transfer(14, acct4, acct5, 300);
        t[13].start();
        //System.out.println("Account 4 Balance: " + acct4.getAccountBalance());
        //System.out.println("Account 5 Balance: " + acct5.getAccountBalance());
        //System.out.println("---------------------------");
        
        t[14] = new Transfer(15, acct5, acct1, 200);
        t[14].start();  
        //System.out.println("Account 5 Balance: " + acct5.getAccountBalance());
        //System.out.println("Account 1 Balance: " + acct1.getAccountBalance());
        //System.out.println("---------------------------");
        
        //Prints final account balances
        System.out.println("");
        System.out.println("Final Account Balances:");
        System.out.println("Account 1 Balance: " + acct1.getAccountBalance());
        System.out.println("Account 2 Balance: " + acct2.getAccountBalance());
        System.out.println("Account 3 Balance: " + acct3.getAccountBalance());
        System.out.println("Account 4 Balance: " + acct4.getAccountBalance());
        System.out.println("Account 5 Balance: " + acct5.getAccountBalance());
    }
    
}
