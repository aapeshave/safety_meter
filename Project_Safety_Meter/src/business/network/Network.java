/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.crime.CrimeRecord;
import business.enterprise.EnterpriseDirectory;
import business.person.PersonDirectory;

/**
 *
 * @author raunak
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private PersonDirectory personDirectory;
    private CrimeRecord crimeRecords;
    private int numOfLicenses=0;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        personDirectory = new PersonDirectory();
        crimeRecords = new CrimeRecord();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CrimeRecord getCrimeRecords() {
        return this.crimeRecords;
    }

    public int getNumOfLicenses() {
        return numOfLicenses;
    }

    public void setNumOfLicenses(int numOfLicenses) {
        this.numOfLicenses = numOfLicenses;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
