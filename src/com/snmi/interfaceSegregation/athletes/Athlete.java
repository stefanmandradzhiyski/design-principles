package com.snmi.interfaceSegregation.athletes;

/**
 * Abstract class Athlete
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public abstract class Athlete {

    /**
     * Variables
     */
    protected String firstName;
    protected String lastName;
    protected int age;

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param age take the age
     */
    public Athlete(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Abstract method which every child class need to implement
     */
    public abstract void presentAthlete();
}
