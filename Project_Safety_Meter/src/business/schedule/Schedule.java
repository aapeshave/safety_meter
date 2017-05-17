/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.schedule;

import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class Schedule {
    private HashMap<Integer, TimeInterval> patrollingSchedule;
    private static int counter=0;
    
    public Schedule(){
        patrollingSchedule = new HashMap<>();
    }

    public HashMap<Integer, TimeInterval> getPatrollingSchedule() {
        return patrollingSchedule;
    }
    
    public void addSchedule(TimeInterval interval){
        counter = patrollingSchedule.values().size();
        interval.setIdentifier(counter);
        patrollingSchedule.put(counter, interval);
    }
}
