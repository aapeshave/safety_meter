/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.FederalOfficer;
import business.role.Role;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author ajinkya
 */
public class DocumentationOrganization extends Organization{
    private Random generator = new Random();
    private HashMap<Integer, Role> roles = new HashMap<Integer, Role>();
    
    public DocumentationOrganization() {
        super(Type.Documentation.getValue());
        roles.put(generator.nextInt(10), new FederalOfficer());
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return roles;
    }
    
}
