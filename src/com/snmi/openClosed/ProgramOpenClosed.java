package com.snmi.openClosed;

import com.snmi.openClosed.employees.Doctor;
import com.snmi.openClosed.employees.Employee;
import com.snmi.openClosed.employees.Nurse;

/**
 * The program implement the open closed principle
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramOpenClosed {

    public static void main(String[] args) {
        HospitalManagement director = new HospitalManagement();
        Employee employeeOne = new Doctor(1, "Lion Liongate", DepartmentType.SURGICAL, true);
        Employee employeeTwo = new Nurse(2, "Merlin Sabel", DepartmentType.CARDIAC, true);
        director.callUpon(employeeOne);
        director.callUpon(employeeTwo);
    }

}
