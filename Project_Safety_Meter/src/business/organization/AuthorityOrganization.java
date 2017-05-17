/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.license.LicenseDirectory;
import business.role.AdminRole;
import business.role.AuthorityOfficerRole;
import business.role.Role;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author ajinkya
 */
public class AuthorityOrganization extends Organization{
    private Random generator = new Random();
    private HashMap<Integer, Role> roles = new HashMap<Integer, Role>();
    private LicenseDirectory licenseDirectory;
    
    public AuthorityOrganization() {
        super(Type.Authority.getValue());
        licenseDirectory = new LicenseDirectory();
        roles.put(generator.nextInt(10), new AuthorityOfficerRole());
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return roles;
    }

    public LicenseDirectory getLicenseDirectory() {
        return licenseDirectory;
    }
}
