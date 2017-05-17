/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.AuthorityOfficerRole;
import business.role.ClerkRole;
import business.role.Role;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ajinkya
 */
public class RecordOrganization extends Organization {
   
    HashMap<Integer, Role> roles = new HashMap<>(); 
    
    private static int count =0;
    public RecordOrganization() {
        super(Type.Record.getValue());
        roles.put(count, new ClerkRole());
        count++;
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        /*
        HashMap<Integer, Role> roles = new HashMap<>();  
        int i=0;
        ClerkRole role = new ClerkRole();
        roles.put(count, (ClerkRole)role);
        count++;
                */
        return roles;
    }
    
}
