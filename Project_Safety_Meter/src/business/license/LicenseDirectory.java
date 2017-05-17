/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.license;

import business.license.FireArmLicense.LicenseType;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class LicenseDirectory {
    private static int counter=0;
    private HashMap<Integer, FireArmLicense> licenseList;

    public LicenseDirectory() {
        this.licenseList = new HashMap<>();
    }
    
    public void addLicense(FireArmLicense license){
        counter = licenseList.values().size();
        license.setLicenseID(counter);
        licenseList.put(counter, license);
    }

    public HashMap<Integer, FireArmLicense> getLicenseList() {
        return licenseList;
    }
    
    public FireArmLicense searchLicense(LicenseType type, String SSN){
        for(Integer licenseKeys : licenseList.keySet()){
            FireArmLicense license = licenseList.get(licenseKeys);
            if(license.getAssignedTo().getSSN().equals(SSN) && license.getType().equals(type)){
                return license;
            }
        }
        return null; 
    }
    
    public int revokeLicense(String SSN){
        Integer[] a = new Integer[10];
        int counter=0;
        for(Integer licenseKeys : licenseList.keySet()){
            FireArmLicense license = licenseList.get(licenseKeys);
            if(license.getAssignedTo().getSSN().equals(SSN)){
                a[counter] = licenseKeys;
                counter++;
            }
        }
       for(int i=0;i<a.length;i++){
           licenseList.remove(a[i]);
       }
       
       return a.length;
    }
}
