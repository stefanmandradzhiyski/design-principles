package com.snmi.interfaceSegregation.athletes;

import com.snmi.interfaceSegregation.atheleIntefaces.Jumpable;

/**
 * Jumping Athlete which extends Athlete abstract class and implement specific interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Jumper extends Athlete implements Jumpable {

    /**
     * Constants
     */
    private static final String JUMPER_COMPETE = "Jumper athlete is stepping up to jump to improve his records";
    private static final String HIGH_JUMP_RECORD = "My high jump record is: %.2f metres";
    private static final String LONG_JUMP_RECORD = "My long jump record is: %.2f metres";
    private static final String JUMPER_PRESENT = "I am jumping athlete. My name is %s %s and I'm %d years old";

    /**
     * Variables
     */
    private double highJumpRecord;
    private double longJumpRecord;

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param age take the age
     * @param highJumpRecord take the high jump record
     * @param longJumpRecord take the long jump record
     */
    public Jumper(String firstName, String lastName, int age, double highJumpRecord, double longJumpRecord) {
        super(firstName, lastName, age);
        this.highJumpRecord = highJumpRecord;
        this.longJumpRecord = longJumpRecord;
    }

    /**
     * Setters and getters
     */
    public double getHighJumpRecord() {
        return highJumpRecord;
    }

    public void setHighJumpRecord(double highJumpRecord) {
        this.highJumpRecord = highJumpRecord;
    }

    public double getLongJumpRecord() {
        return longJumpRecord;
    }

    public void setLongJumpRecord(double longJumpRecord) {
        this.longJumpRecord = longJumpRecord;
    }

    /**
     * Implementation of Athletable common interface
     */
    @Override
    public void compete() {
        System.out.println(JUMPER_COMPETE);
    }

    /**
     * Implementation of Jumpable interface methods
     */
    @Override
    public void highJumpRecord() {
        System.out.printf(HIGH_JUMP_RECORD, highJumpRecord);
        System.out.println();
    }

    @Override
    public void longJumpRecord() {
        System.out.printf(LONG_JUMP_RECORD, longJumpRecord);
        System.out.println();
    }

    /**
     * Implementation of abstract Athlete class method
     */
    @Override
    public void presentAthlete() {
        System.out.printf(JUMPER_PRESENT, firstName, lastName, age);
        System.out.println();
        highJumpRecord();
        longJumpRecord();
        compete();
    }
}
