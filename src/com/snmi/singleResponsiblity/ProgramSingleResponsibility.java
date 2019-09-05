package com.snmi.singleResponsiblity;

import com.snmi.singleResponsiblity.company.Company;
import com.snmi.singleResponsiblity.company.JobPositionType;
import com.snmi.singleResponsiblity.hr.HumanResource;

/**
 * The program shows implementation of Single Responsibility principle
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramSingleResponsibility {

    /**
     * Constants
     */
    private static final String ALL_EMPLOYEES = "All %s employees daily responsibilities:";
    private static final String COMPANY_EMPLOYEES_NUMBER = "%s employees number: %d";

    public static void main(String[] args) {
        Company company = new Company("UBOtech");
        HumanResource humanResource = new HumanResource("Sophia", "Fernandes");

        Person firstPerson = new Person("Stefan", "Mandradzhiyski", 4);
        Person secondPerson = new Person("Stefan", "Stefanov", 8);

        humanResource.hireNewEmployee(firstPerson, 977, JobPositionType.DEVELOPER, company);
        humanResource.hireNewEmployee(secondPerson, 985, JobPositionType.ADMINISTRATOR, company);

        System.out.printf(ALL_EMPLOYEES, company.getCompanyName());
        System.out.println();
        company.getCompanyEmployees().forEach(Employee::dailyActions);
        System.out.printf(COMPANY_EMPLOYEES_NUMBER, company.getCompanyName(), company.getCompanyEmployees().size());
    }

}
