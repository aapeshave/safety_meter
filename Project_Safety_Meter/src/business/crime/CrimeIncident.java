/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.crime;

import business.person.Person;
import business.person.PersonDirectory;
import java.util.Date;

/**
 *
 * @author ajinkya
 */
public class CrimeIncident {
    private int crimeId;
    private Date crimeHappenedOn;
    private String status;
    private PersonDirectory involvedpeople;
    private String description;
    private Person addedBy;
    private Person assignedTo;
    private String address;
    

    public CrimeIncident(){
        this.crimeHappenedOn = new Date();
        this.involvedpeople = new PersonDirectory();
    }
    
    public Integer getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(int crimeId) {
        this.crimeId = crimeId;
    }
   
    public Person getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Person assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getCrimeHappenedOn() {
        return crimeHappenedOn;
    }

    public void setCrimeHappenedOn(Date crimeHappenedOn) {
        this.crimeHappenedOn = crimeHappenedOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PersonDirectory getInvolvedpeople() {
        return involvedpeople;
    }

    public void setInvolvedpeople(PersonDirectory involvedpeople) {
        this.involvedpeople = involvedpeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Person addedBy) {
        this.addedBy = addedBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
        return Integer.toString(crimeId);
    }
    
}
