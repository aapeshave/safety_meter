/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import com.db4o.collections.ActivatableHashMap;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ajinkya
 */
public class WorkQueue {
    private HashMap<Integer, WorkRequest> workRequstList;
    private static int count=0;
    public WorkQueue(){
        this.workRequstList = new HashMap<>();
    }

    public HashMap<Integer, WorkRequest> getWorkRequstList() {
        return workRequstList;
    }
    
    public void addWorkRequest(WorkRequest work){
       count = workRequstList.values().size();
       workRequstList.put(count++, work);
       //JOptionPane.showMessageDialog(null, count);
    }
}
