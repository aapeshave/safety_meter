/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ajinkya
 */
public class OrganizationDirectory {
    private HashMap<Integer, Organization> organizationDirectory;
    
    
    public OrganizationDirectory(){
        organizationDirectory = new HashMap<>();
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        Random generator = new Random();
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationDirectory.put(generator.nextInt(100),organization);
        }
        else if(type.getValue().equals(Type.Record.getValue())){
            organization = new RecordOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else if(type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else if(type.getValue().equals(Type.Authority.getValue())){
            organization = new AuthorityOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else if(type.getValue().equals(Type.Supervision.getValue())){
            organization = new SuperVisionOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else if(type.getValue().equals(Type.Patrolling.getValue())){
            organization = new PatrollingOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else if(type.getValue().equals(Type.Investigation.getValue())){
            organization = new InvestigationOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else if(type.getValue().equals(Type.Documentation.getValue())){
            organization = new DocumentationOrganization();
            organizationDirectory.put(generator.nextInt(100), organization);
        }
        else{
            JOptionPane.showMessageDialog(null, "No Suitable Type Found");
        }

        return organization;
    }

    public HashMap<Integer, Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
