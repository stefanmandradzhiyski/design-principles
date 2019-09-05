package com.snmi.interfaceSegregation;

import com.snmi.interfaceSegregation.athletes.Athlete;
import com.snmi.interfaceSegregation.athletes.Jumper;
import com.snmi.interfaceSegregation.athletes.Swimmer;

/**
 * The program shows a simple implementation of Interface Segregation principle
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramInterfaceSegregation {

    public static void main(String[] args) {
        Athlete swimmingAthlete = new Swimmer("Stefan", "Mandradzhiyski", 24, 2562.5);
        Athlete jumpingAthlete = new Jumper("Stephen", "Stephenov", 25, 2.36, 16.5);

        swimmingAthlete.presentAthlete();
        System.out.println();
        jumpingAthlete.presentAthlete();
    }

}
