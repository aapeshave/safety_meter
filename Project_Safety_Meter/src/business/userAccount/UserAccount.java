/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.employee.Employee;
import business.role.Role;
import business.workQueue.WorkQueue;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import java.util.Date;

/**
 *
 * @author ajinkya
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue inQueue;
    private WorkQueue outQueue;
    private Date createdOn;
    private Date updatedOn;

    public UserAccount(){
        this.createdOn  =  new Date();
        this.inQueue = new WorkQueue();
        this.outQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getInQueue() {
        return inQueue;
    }

    public void setInQueue(WorkQueue inQueue) {
        this.inQueue = inQueue;
    }

    public WorkQueue getOutQueue() {
        return outQueue;
    }

    public void setOutQueue(WorkQueue outQueue) {
        this.outQueue = outQueue;
    }
    
    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
    
    public String toString(){
        return this.username;
    }
}
