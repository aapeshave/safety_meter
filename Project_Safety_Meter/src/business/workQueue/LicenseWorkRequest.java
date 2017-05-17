/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.person.Person;

/**
 *
 * @author ajinkya
 */
public class LicenseWorkRequest extends WorkRequest {
    private Person holder ;
    private int licensePeriod;
    private String reason;
    
    public Person getHolder() {
        return holder;
    }

    public void setHolder(Person holder) {
        this.holder = holder;
    }

    public int getLicensePeriod() {
        return licensePeriod;
    }

    public void setLicensePeriod(int licensePeriod) {
        this.licensePeriod = licensePeriod;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
