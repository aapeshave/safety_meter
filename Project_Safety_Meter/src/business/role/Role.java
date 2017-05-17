/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ajinkya
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        AuthorityOfficer("Authority Officer"),
        Clerk("Clerk"),
        PatrollingOfficer("Patrolling Officer"),
        Suprervisior("Supervisior Office"),
        Detective("Detective"),
        Patient("Patient"),
        FederalOfficer("Federal Officer"),
        Person("Person"),
        Receptioist("Receptionist");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);
 
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
