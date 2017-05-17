/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.AdminRole;
import business.role.Role;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class AdminOrganization extends Organization{

    int counter=0;    
    public AdminOrganization() {
        super(Type.Admin.getValue());
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        HashMap<Integer, Role> roles = new HashMap<Integer, Role>();
        counter++;
        roles.put(counter, new AdminRole());
        return roles;
    }
    
}
