package com.snmi.singleResponsiblity.company;

import com.snmi.singleResponsiblity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Company object which will contain all employees
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Company implements Responsible{

    /**
     * Variable
     */
    private String companyName;
    private List<Employee> companyEmployees = new ArrayList<>();

    /**
     * Default constructor
     */
    public Company() {}

    /**
     * Custom constructor
     * @param companyName take the company name
     */
    public Company(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Setters and getters
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Employee> getCompanyEmployees() {
        return companyEmployees;
    }

    public void setCompanyEmployees(List<Employee> companyEmployees) {
        this.companyEmployees = companyEmployees;
    }

    /**
     * Implementation of company responsible add to company method
     * @param employee take the employee
     */
    @Override
    public void addToCompany(Employee employee) {
        companyEmployees.add(employee);
    }
}
