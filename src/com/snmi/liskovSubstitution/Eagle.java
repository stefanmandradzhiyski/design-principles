package com.snmi.liskovSubstitution;

/**
 * Eagle is a specific bird
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Eagle extends Bird{

    /**
     * Constants
     */
    private static final String FLY = "I'm eagle so I can fly very fast and high. ";

    public void fly() {
        System.out.println(FLY);
    }

}
