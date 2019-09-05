package com.snmi.liskovSubstitution;

/**
 * The program shows a little implementation of Liskov Substitution principle
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramLiskovSubstitution {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Hen hen = new Hen();

        //Specific eagle method
        eagle.fly();
        //Bird methods
        eagle.eat();
        eagle.birth();

        //Specific hen method
        hen.eatMore();
        //Bird methods
        hen.eat();
        hen.birth();
    }

}
