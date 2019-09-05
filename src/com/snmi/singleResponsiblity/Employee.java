package com.snmi.singleResponsiblity;

import com.snmi.singleResponsiblity.company.JobPositionType;

public class Employee extends Person implements Followable {

    /**
     * Constants
     */
    private static final String DAILY_ACTION_DEVELOPER = "%s %s need to create specific system modules for his client. ";
    private static final String DAILY_ACTION_ADMINISTRATOR = "%s %s need to maintain and fix all problem computers in the company. ";
    private static final String NO_SUCH_JOB_POSITION = "No such job position in the company";
    private static final String TAKE_CARE = "%s %s need to follow all company's rules. ";
    private static final String EMPLOYEE_PRESENTATION = "%s %s with %d years experience at position %s. Employee id is %d";

    /**
     * Variables
     */
    private int systemId;
    private JobPositionType jobPositionType;

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param yearExperience take the year experience
     * @param systemId take the system id
     * @param jobPositionType take the job position
     */
    public Employee(String firstName, String lastName, int yearExperience, int systemId, JobPositionType jobPositionType) {
        super (firstName, lastName, yearExperience);
        this.systemId = systemId;
        this.jobPositionType = jobPositionType;
    }

    /**
     * Setters and getters
     */
    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    public JobPositionType getJobPositionType() {
        return jobPositionType;
    }

    public void setJobPositionType(JobPositionType jobPositionType) {
        this.jobPositionType = jobPositionType;
    }

    /**
     * Implementation of daily action method
     */
    @Override
    public void dailyActions() {

        switch (jobPositionType) {
            case DEVELOPER:
                System.out.printf(DAILY_ACTION_DEVELOPER, super.getFirstName(), super.getLastName());
                System.out.println();
                break;
            case ADMINISTRATOR:
                System.out.printf(DAILY_ACTION_ADMINISTRATOR, super.getFirstName(), super.getLastName());
                System.out.println();
                break;
            default:
                throw new IllegalArgumentException(NO_SUCH_JOB_POSITION);
        }

    }

    /**
     * Implementation of take care method
     */
    @Override
    public void takeCare() {
        System.out.printf(TAKE_CARE, super.getFirstName(), super.getLastName());
        System.out.println();
    }

    /**
     * Implementation of to string method
     * @return the employee presentation
     */
    @Override
    public String toString() {
        return String.format(EMPLOYEE_PRESENTATION, super.getFirstName(), super.getLastName(),
                super.getYearExperience(), getJobPositionType(), getSystemId());
    }
}
