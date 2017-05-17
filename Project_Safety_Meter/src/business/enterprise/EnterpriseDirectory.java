/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class EnterpriseDirectory {
    private HashMap<Integer, Enterprise> enterpriseList;
    int counter=0;

    public EnterpriseDirectory() {
        enterpriseList = new HashMap<Integer, Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise newEnterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital){
            newEnterprise = new HospitalEnterprise(name);
            enterpriseList.put(counter++, newEnterprise);
        }
        else if(type == Enterprise.EnterpriseType.PoliceStation){
            newEnterprise = new PoliceStationEnterprise(name);
            enterpriseList.put(counter++, newEnterprise);
        }
        else{
            newEnterprise = new FireArmLicenseEnterprise(name);
            enterpriseList.put(counter++, newEnterprise);
        }
        return newEnterprise;
    }

    public HashMap<Integer, Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    
}
