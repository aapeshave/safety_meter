/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.license;

import business.person.Person;
import java.util.Date;

/**
 *
 * @author ajinkya
 */
public class FireArmLicense {
    private int licenseID;
    private int licensePeriod;
    private Date validFrom;
    private Date validTill;
    private Person assignedTo;
    private int price;
    private LicenseType type;
    private int updatedTime;
    private Date updatedOn;
    
    public enum LicenseType{
        Commercial("Commerical License", 450),
        Manufacturer("Manufacturer License",550),
        Dealer("Dealer License",300),
        Importer("Importer License",350),
        Collector("Collector License",375);
        
        private String value;
        private int price;
        
        private LicenseType(String value, int price){
            this.value = value;
            this.price = price;
        }
        
        public String getValue(){
            return this.value;
        }
        
        public Integer getPrice(){
            return this.price;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }

    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

    
    public FireArmLicense() {
        this.validFrom = new Date();
    }
    
    public int getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(int licenseID) {
        this.licenseID = licenseID;
    }

    public int getLicensePeriod() {
        return licensePeriod;
    }

    public void setLicensePeriod(int licensePeriod) {
        this.licensePeriod = licensePeriod;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public Person getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Person assignedTo) {
        this.assignedTo = assignedTo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String toString(){
        return Integer.toString(this.licenseID);
    }

    public int getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(int updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
    
    
    
}
