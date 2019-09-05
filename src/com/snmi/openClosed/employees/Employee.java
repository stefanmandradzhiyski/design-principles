package com.snmi.openClosed.employees;

import com.snmi.openClosed.DepartmentType;

/**
 * Abstract employee object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
abstract public class Employee {

    /**
     * Variables
     */
    private int id;
    private String name;
    private DepartmentType departmentType;
    private boolean working;

    /**
     * Custom constructor
     * @param id take the id
     * @param name take the name
     * @param departmentType take the department
     * @param working take working status
     */
    public Employee(int id, String name, DepartmentType departmentType, boolean working) {
        this.id = id;
        this.name = name;
        this.departmentType = departmentType;
        this.working = working;
    }

    /**
     * Implementation of to string method
     * @return the employee presentation
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + departmentType + '\'' +
                ", working=" + working +
                '}';
    }

    /**
     * Perform duties method which every employee need to implement
     */
    public abstract void performDuties();
}
