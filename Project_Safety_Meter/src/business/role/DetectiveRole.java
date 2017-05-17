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
import userInterface.investigator.InvestigatorWorkArea;

/**
 *
 * @author ajinkya
 */
public class DetectiveRole extends Role{
    public static final String TYPE = Role.RoleType.Detective.getValue();
    
    @Override
    public String toString(){
        return TYPE;
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new InvestigatorWorkArea(userProcessContainer,account,organization,enterprise, network);
    }
    
}
