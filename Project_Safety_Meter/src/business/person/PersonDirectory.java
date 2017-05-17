/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import java.util.HashMap;

/**
 *
 * @author ajinkya
 */
public class PersonDirectory {
    private HashMap<String, Person> personList;
    
    public PersonDirectory(){
        personList = new HashMap<>();
    }

    public HashMap<String, Person> getPersonList() {
        return personList;
    }
    
    public void addPerson(Person person){
        personList.put(person.getSSN(), person);
    }
    
    public Person searchPerson(String key){
        return personList.get(key);
    }
    
}
