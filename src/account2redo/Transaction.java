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
public abstract class Transaction extends Thread {
    protected int tNumber;
    protected Account transAcct;
    
    public Transaction(int transNumber)  {
        tNumber = transNumber;

    }
    public abstract void makeTransaction();
}
