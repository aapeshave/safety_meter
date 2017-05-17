/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.ReceptionistRole;
import business.role.Role;
import business.role.SuperVisiorRole;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class SuperVisionOrganization extends Organization {
    HashMap<Integer, Role> roles = new HashMap<Integer, Role>();
    private static int counter = 0;
    
    public SuperVisionOrganization() {
        super(Type.Supervision.getValue());
        roles.put(counter, new SuperVisiorRole());
        counter++;
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return roles;
    }
    
}
