/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.PatrollingOfficerRole;
import business.role.Role;
import business.schedule.Schedule;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class PatrollingOrganization extends Organization {
    
    private HashMap<Integer, Role> roles = new HashMap<>(); 
    private static int count =0;
    private Schedule schedule;
    
    public PatrollingOrganization() {
        super(Type.Patrolling.getValue());
        schedule = new Schedule();
        roles.put(count, new PatrollingOfficerRole());
        count++;
    }

    @Override
    public HashMap<Integer, Role> getSupportedRole() {
        return roles;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
