package com.snmi.openClosed.employees;

import com.snmi.openClosed.DepartmentType;

/**
 * Doctor employee
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Doctor extends Employee {

    /**
     * Custom constructor
     * @param id take the id
     * @param name take the name
     * @param departmentType take the department
     * @param working take working status
     */
    public Doctor(int id, String name, DepartmentType departmentType, boolean working) {
        super(id, name, departmentType, working);
    }

    /**
     * Prescribe medicine to patients
     */
    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }

    /**
     * Diagnose patients
     */
    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }

    /**
     * Perform his duties
     */
    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();

    }


}
