package com.snmi.dependencyInversion;

import com.snmi.dependencyInversion.manufacturers.GeneralManufacturingProcess;
import com.snmi.dependencyInversion.manufacturers.LaptopManufacturingProcess;
import com.snmi.dependencyInversion.manufacturers.SmartphoneManufacturingProcess;

/**
 * The program shows simple implementation of Dependency Inversion Principle
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class DeviceFactory {

    public static void main(String[] args){
        GeneralManufacturingProcess smartphoneManufacturer = new SmartphoneManufacturingProcess("Apple Iphone XS");
        smartphoneManufacturer.launchProcess();

        GeneralManufacturingProcess laptopManufacturer = new LaptopManufacturingProcess("Lenovo FURY");
        laptopManufacturer.launchProcess();
    }
}
