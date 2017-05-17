/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.transaction;

import java.util.Date;

/**
 *
 * @author ajinkya
 */
public class Transaction {
    private int  transactionID;
    private Date transactionDate;
    private int amount;
    private String status;
    private TransactionType type;
    
    public Transaction(){
        this.transactionDate = new Date();
    }
    
    public enum TransactionType{
        Credit("Credit Transcation"),
        Debit("Debit Transcation");
        
        private String value;
        
        private TransactionType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        public String toString(){
            return this.value;
        }
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return Integer.toString(this.transactionID);
    }
}
