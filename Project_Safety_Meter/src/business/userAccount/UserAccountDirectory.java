/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.employee.Employee;
import business.role.Role;
import com.db4o.collections.MapEntry4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author ajinkya
 */
public class UserAccountDirectory {
    private HashMap<String, UserAccount> userAccountDirectory;
    private int counter=100;
    
    public UserAccountDirectory(){
        this.userAccountDirectory = new HashMap<>();
    }

    public HashMap<String, UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount addUserAccount(String userName, String password, Employee emp, Role role){
        counter++;
        UserAccount newAccount = new UserAccount();
        newAccount.setEmployee(emp);
        newAccount.setUsername(userName);
        newAccount.setPassword(password);
        newAccount.setRole(role);
        
        this.userAccountDirectory.put(userName, newAccount);
        return newAccount;
    }
    
    public UserAccount authenticateUser(String userName, String password){
        UserAccount user;
        
        if(userAccountDirectory.containsKey(userName)){
            user = userAccountDirectory.get(userName);
            if(user.getPassword().equals(password) && user.getUsername().equals(userName))
                return user;
            
        }
        return null;
    }
    
    public boolean checkUniqueUsername(String userName){
        
        return !userAccountDirectory.containsKey(userName);
        
    }
    
}
