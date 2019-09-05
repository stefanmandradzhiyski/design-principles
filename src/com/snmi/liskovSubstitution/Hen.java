package com.snmi.liskovSubstitution;

/**
 * Hen is a specific bird
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Hen extends Bird{

    /**
     * Constants
     */
    private static final String EAT_MORE = "I'm hen, so I can eat whatever I want";

    public void eatMore() {
        System.out.println(EAT_MORE);
    }

}
