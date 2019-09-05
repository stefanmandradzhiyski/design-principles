package com.snmi.dependencyInversion.manufacturers;

/**
 * Smartphone manufacturing process object which extends the general manufacturing process
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    /**
     * Constants
     */
    private static final String ASSEMBLY_DEVICE = "Assembled smartphone %s";
    private static final String TEST_DEVICE = "Tested smartphone %s";
    private static final String PACKAGE_DEVICE = "Packaged smartphone %s";
    private static final String STORE_DEVICE = "Stored smartphone %s";

    /**
     * Custom constructor
     * @param name take the name
     */
    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    /**
     * Implementation of all general manufacturing abstract methods
     */
    @Override
    protected void assemblyDevice() {
        System.out.printf(ASSEMBLY_DEVICE, processName);
        System.out.println();
    }

    @Override
    protected void testDevice() {
        System.out.printf(TEST_DEVICE, processName);
        System.out.println();
    }

    @Override
    protected void packageDevice() {
        System.out.printf(PACKAGE_DEVICE, processName);
        System.out.println();
    }

    @Override
    protected void storeDevice() {
        System.out.printf(STORE_DEVICE, processName);
        System.out.println();
    }

}
