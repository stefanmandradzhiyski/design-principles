package com.snmi.liskovSubstitution;

/**
 * Common class for all birds
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Bird {

    /**
     * Constants
     */
    private static final String EAT = "I'm bird and I can eat grass";
    private static final String BIRTH = "I'm bird, so I lay eggs";

    public void eat() {
        System.out.println(EAT);
    }

    public void birth() {
        System.out.println(BIRTH);
    }

}
