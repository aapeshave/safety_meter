/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import business.transaction.TransactionHistory;
import business.userAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class Person {
    private String SSN;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNum;
    private String email;
    private TransactionHistory transactionHistory;
    private Date birthdate;
    private UserAccount userAccount;
    private int monthlyIncome;
    private int doesHaveLicense;

    public Person() {
        this.transactionHistory = new TransactionHistory();
        this.userAccount = new UserAccount();
    }
    
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getDoesHaveLicense() {
        return doesHaveLicense;
    }

    public void setDoesHaveLicense(int doesHaveLicense) {
        this.doesHaveLicense = doesHaveLicense;
    }
        
    @Override
    public String toString() {
        return this.firstName+" "+this.lastName;
    }
    
    
}
