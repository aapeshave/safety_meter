/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.schedule;

import business.userAccount.UserAccount;

/**
 *
 * @author ajinkya
 */
public class TimeInterval {
    private int identifier;
    private int startTime;
    private int EndTime;
    private UserAccount patrollingOfficer;
    private int doneShift;

    public TimeInterval() {
        doneShift =0;
    }
    
    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void setEndTime(int EndTime) {
        this.EndTime = EndTime;
    }

    public UserAccount getPatrollingOfficer() {
        return patrollingOfficer;
    }

    public void setPatrollingOfficer(UserAccount patrollingOfficer) {
        this.patrollingOfficer = patrollingOfficer;
    }

    public int getDoneShift() {
        return doneShift;
    }

    public void setDoneShift(int doneShift) {
        this.doneShift = doneShift;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.identifier); 
    }
    
    
}
