/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.crime.CrimeIncident;

/**
 *
 * @author ajinkya
 */
public class InvestigationWorkRequest extends WorkRequest {
    private CrimeIncident incident;

    public CrimeIncident getIncident() {
        return incident;
    }

    public void setIncident(CrimeIncident incident) {
        this.incident = incident;
    }
}
