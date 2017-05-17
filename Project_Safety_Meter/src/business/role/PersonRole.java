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
import static business.role.PatrollingOfficerRole.TYPE;
import business.userAccount.UserAccount;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.person.PersonWorkArea;

/**
 *
 * @author ajinkya
 */
public class PersonRole extends Role {
    public static final String TYPE = Role.RoleType.Person.getValue();
    
    @Override
    public String toString(){
        return TYPE;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        //JOptionPane.showMessageDialog(userProcessContainer, network);
        return new PersonWorkArea(userProcessContainer, account, network);
    }
    
}
