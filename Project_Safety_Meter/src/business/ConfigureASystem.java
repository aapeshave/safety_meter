/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.person.Person;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author ajinkya
 */
public class ConfigureASystem {
    public static EcoSystem configureSystem(){
        EcoSystem system = EcoSystem.getInstance();
        Employee newEmployee = new Employee();
        Person newPerson = new Person();
        
        newPerson.setFirstName("Ajinkya");
        newPerson.setLastName("Peshave");
        newPerson.setSSN("201-75-6877");
        newEmployee.setPerson(newPerson);
        
        system.getEmployeeDirectory().addEmployee(newEmployee);
        system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", newEmployee, new SystemAdminRole());
        
        return system;
    }
}
