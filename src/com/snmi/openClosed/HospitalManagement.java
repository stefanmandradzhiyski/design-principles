package com.snmi.openClosed;

import com.snmi.openClosed.employees.Employee;

/**
 * Hospital Management which say to employee to work
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class HospitalManagement {

    public void callUpon(Employee employee){
        employee.performDuties();
    }

}
