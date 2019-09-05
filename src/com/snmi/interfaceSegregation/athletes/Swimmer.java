package com.snmi.interfaceSegregation.athletes;

import com.snmi.interfaceSegregation.atheleIntefaces.Swimable;

/**
 * Swimming Athlete which extends Athlete abstract class and implement specific interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Swimmer extends Athlete implements Swimable {

    /**
     * Constants
     */
    private static final String SWIMMER_COMPETE = "Swimming athlete begins to swim to improve his record...";
    private static final String SWIM_RECORD = "My swim record is: %.2f metres";
    private static final String SWIMMER_PRESENT = "I am swimming athlete. My name is %s %s and I'm %d years old";

    /**
     * Variables
     */
    private double swimDistanceRecord;

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param age take the age
     * @param swimDistanceRecord take the swim distance record
     */
    public Swimmer(String firstName, String lastName, int age, double swimDistanceRecord) {
        super(firstName, lastName, age);
        this.swimDistanceRecord = swimDistanceRecord;
    }

    /**
     * Setters and getters
     */
    public double getSwimDistanceRecord() {
        return swimDistanceRecord;
    }

    public void setSwimDistanceRecord(double swimDistanceRecord) {
        this.swimDistanceRecord = swimDistanceRecord;
    }

    /**
     * Implementation of Athletable common interface
     */
    @Override
    public void compete() {
        System.out.println(SWIMMER_COMPETE);
    }

    /**
     * Implementation of Swimable interface methods
     */
    @Override
    public void swimRecord() {
        System.out.printf(SWIM_RECORD, swimDistanceRecord);
        System.out.println();
    }


    /**
     * Implementation of abstract Athlete class method
     */
    @Override
    public void presentAthlete() {
        System.out.printf(SWIMMER_PRESENT, firstName, lastName, age);
        System.out.println();
        swimRecord();
        compete();
    }
}
