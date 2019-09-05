package com.snmi.singleResponsiblity.hr;

import com.snmi.singleResponsiblity.Employee;
import com.snmi.singleResponsiblity.company.JobPositionType;
import com.snmi.singleResponsiblity.Person;
import com.snmi.singleResponsiblity.company.Company;

/**
 * Human resource which job is to make a person -> employee
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class HumanResource implements Hireable {

    /**
     * Constants
     */
    private static final String HR_TASK = "%s %s hired a new employee %s";

    /**
     * Variables
     */
    private String firstName;
    private String lastName;

    /**
     * Default constructor
     */
    public HumanResource() {}

    /**
     * Custom constructor
     * @param firstName take first name
     * @param lastName take last name
     */
    public HumanResource(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Setters and getters
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Implementation of hire new employee method. Make a person company employee and add him to the company
     * @param person take the person
     * @param jobPositionType take the job position
     * @param systemId take the new system id
     * @param company take the company
     */
    @Override
    public void hireNewEmployee(Person person, int systemId, JobPositionType jobPositionType, Company company) {
        Employee employee = new Employee(person.getFirstName(), person.getLastName(), person.getYearExperience(),
                systemId, jobPositionType);
        company.addToCompany(employee);
        HRTask(employee);
    }

    /**
     * HR Task present the new employee in the company
     * @param employee take the employee
     */
    private void HRTask(Employee employee) {
        System.out.printf(HR_TASK, getFirstName(), getLastName(), employee);
        System.out.println();
    }

}
