/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.transaction;

import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class TransactionHistory {
    private static int counter=0;
    private HashMap<Integer, Transaction> transactionList;
    
    public TransactionHistory(){
        this.transactionList = new HashMap<>();
    }

    public HashMap<Integer, Transaction> getTransactionList() {
        return transactionList;
    }
    
    public void addTransaction(Transaction transaction){
        counter = transactionList.values().size();
        transaction.setTransactionID(counter);
        transactionList.put(transaction.getTransactionID(), transaction);
    }
    
    public Transaction searchTransaction(Integer ID){
        return transactionList.get(ID);
    }
   
}
