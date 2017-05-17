/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.AdminRole;
import business.role.ClerkRole;
import business.role.ReceptionistRole;
import business.role.Role;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author ajinkya
 */
public class ReceptionOrganization extends Organization {
    HashMap<Integer, Role> roles = new HashMap<Integer, Role>();
    private static int counter = 0;
    
    public ReceptionOrganization() {
        super(Type.Reception.getValue());
        roles.put(counter, new ReceptionistRole());
        counter++;
    }
    
    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return roles;
    }
    
}
