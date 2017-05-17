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
import userInterface.clerkInterface.ClerkWorkArea;

/**
 *
 * @author ajinkya
 */
public class ClerkRole extends Role {

    public static final String TYPE = Role.RoleType.Clerk.getValue();
  
    @Override
    public String toString(){
        return TYPE;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ClerkWorkArea(userProcessContainer,account,organization,enterprise, network);
    }
    
}
