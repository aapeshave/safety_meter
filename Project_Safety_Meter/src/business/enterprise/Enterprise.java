/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.Organization;
import business.organization.OrganizationDirectory;

/**
 *
 * @author ajinkya
 */
public abstract class Enterprise extends Organization {
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        PoliceStation("Police Department"),
        FederalOffice("Federal Office"),
        FireArmLicense("FireArm License Enterprise");
        
        public String value;

        public String getValue() {
            return value;
        }

        private EnterpriseType(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
   
}
