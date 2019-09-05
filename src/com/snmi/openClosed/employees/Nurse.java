package com.snmi.openClosed.employees;

import com.snmi.openClosed.DepartmentType;

/**
 * Nurse employee
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Nurse extends Employee{

    /**
     * Custom constructor
     * @param id take the id
     * @param name take the name
     * @param departmentType take the department
     * @param working take working status
     */
    public Nurse(int id, String name, DepartmentType departmentType, boolean working) {
        super(id, name, departmentType, working);
    }

    /**
     * Check vital signs
     */
    private void checkVitalSigns(){
        System.out.println("Checking Vitals");
    }

    /**
     * Draw blood
     */
    private void drawBlood(){
        System.out.println("Drawing blood");
    }

    /**
     * Clean patient araea
     */
    private void cleanPatientArea(){
        System.out.println("Cleaning Patient Area");
    }

    /**
     * Perform her duties
     */
    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

}
