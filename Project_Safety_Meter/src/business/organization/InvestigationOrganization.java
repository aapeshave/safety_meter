/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DetectiveRole;
import business.role.Role;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class InvestigationOrganization extends Organization {
    HashMap<Integer, Role> roles = new HashMap<>(); 
    private static int count =0;
    
    public InvestigationOrganization() {
        super(Type.Investigation.getValue());
        roles.put(count, new DetectiveRole());
        count++;
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return roles;
    }
    
}
