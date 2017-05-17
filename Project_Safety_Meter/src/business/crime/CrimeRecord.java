/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.crime;

import business.person.Person;
import business.person.PersonDirectory;
import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class CrimeRecord {
    private HashMap<Integer, CrimeIncident> crimeRecord;
    private static int counter=0;
    
    public CrimeRecord(){
        crimeRecord = new HashMap<>();
    }

    public HashMap<Integer, CrimeIncident> getCrimeRecord() {
        return crimeRecord;
    }
    
    
    
    public void addCrimeIncident(CrimeIncident crime){
        counter = crimeRecord.values().size();
        crime.setCrimeId(++counter);
        crimeRecord.put(counter, crime);
        
    }
    
    public CrimeRecord searchPersonRecord(String SSN){
        CrimeRecord newRecord = new CrimeRecord();
        int count=0;
        for(Integer incidentKeys : crimeRecord.keySet()){
            CrimeIncident crime = crimeRecord.get(incidentKeys);
                if(crime.getInvolvedpeople().getPersonList().containsKey(SSN)){
                    Person criminal = crime.getInvolvedpeople().getPersonList().get(SSN);
                    newRecord.crimeRecord.put(crime.getCrimeId(), crime);
                    count++;
                }
        }
        if(count>0)
            return newRecord;
        else
            return null;
    }
}
