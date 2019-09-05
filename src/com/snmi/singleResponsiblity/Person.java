package com.snmi.singleResponsiblity;

/**
 * Employee
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Person {

    /**
     * Variables
     */
    private String firstName;
    private String lastName;
    private int yearExperience;

    /**
     * Default constructor
     */
    public Person() {}

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param yearExperience take the year experience
     */
    public Person(String firstName, String lastName, int yearExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearExperience = yearExperience;
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

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    /**
     * Implementation of to string method
     * @return the person presentation
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearExperience=" + yearExperience +
                '}';
    }
}
