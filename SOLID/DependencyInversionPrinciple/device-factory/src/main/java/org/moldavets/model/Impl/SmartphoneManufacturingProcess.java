package org.moldavets.model.Impl;

import org.moldavets.model.AbstractManufacturingProcess;

public class SmartphoneManufacturingProcess extends AbstractManufacturingProcess {

    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assemble smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("Test smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Package smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store smartphone");
    }
}
