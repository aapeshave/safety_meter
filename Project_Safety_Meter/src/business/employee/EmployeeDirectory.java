/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.person.Person;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ajinkya
 */
public class EmployeeDirectory {
    private HashMap<String, Employee> employeeDirectory;

    public EmployeeDirectory() {
        this.employeeDirectory = new HashMap<>();
    }
    
    public void addEmployee(Employee newEmployee){
        this.employeeDirectory.put(newEmployee.getPerson().getSSN(), newEmployee);
    }
    
    public void removeEmployee(Employee employee){
        this.employeeDirectory.remove(employee.getPerson().getSSN());
    }

    public HashMap<String, Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public Employee searchEmployee(int SSN){
        Employee employee;
        Set set = employeeDirectory.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            if((Integer)mentry.getKey() == SSN){
                employee = (Employee) mentry.getValue();
                return employee;
            }
        }
        return null;
    }
}
