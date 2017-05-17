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
public class FederalOffice extends Enterprise {

    public FederalOffice(String name) {
        super(name, EnterpriseType.FederalOffice);
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return null;
    }
}
