package com.snmi.dependencyInversion.manufacturers;

/**
 * Abstract General manufacturing process object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
abstract public class GeneralManufacturingProcess {

    private static final String NO_PROCESS = "No process name was specified";

    /**
     * Variable
     */
    protected String processName;

    /**
     * Custom constructor
     * @param name take the name
     */
    public GeneralManufacturingProcess(String name){
        processName = name;
    }

    /**
     * Abstract methods
     */
    protected abstract void assemblyDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    /**
     * Launching the process
     */
    public void launchProcess(){
        if (processName != null && !processName.isEmpty()){
            assemblyDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else{
            System.out.println(NO_PROCESS);
        }
    }
}
