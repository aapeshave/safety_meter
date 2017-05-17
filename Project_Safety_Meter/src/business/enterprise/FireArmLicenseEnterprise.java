/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class FireArmLicenseEnterprise extends Enterprise {

    public FireArmLicenseEnterprise(String name) {
        super(name, EnterpriseType.FireArmLicense);
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return null;
    }
    
}
