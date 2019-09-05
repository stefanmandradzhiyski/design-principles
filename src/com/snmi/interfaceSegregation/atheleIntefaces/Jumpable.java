package com.snmi.interfaceSegregation.atheleIntefaces;

/**
 * Jumpable interface for Jumping Athletes
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface Jumpable extends Athletable{

    void highJumpRecord();
    void longJumpRecord();

}
