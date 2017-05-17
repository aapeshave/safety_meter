/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private HashMap<String, Network> networkList;
    private int count=0;
    
    
    public EcoSystem() {
        super(null);
        networkList = new HashMap<>();
    }

    public static EcoSystem getInstance(){
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public HashMap<String, Network> getNetworkList() {
        return networkList;
    }
    
    public Network createAndAddNetwork(String name) {
        Network network = new Network();
        network.setName(name);
        if(!networkList.containsKey(name)){
            networkList.put(name,network);
            return network;
        }
        else
            return null;
    }
    
    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        int count=0;
        HashMap<Integer, Role> roles  = new HashMap<>();
        roles.put(count++, new SystemAdminRole());
        return roles;
    }
    
}
