/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public class HospitalEnterprise extends Enterprise{

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return null;
    }

    
}
