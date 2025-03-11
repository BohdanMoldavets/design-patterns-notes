package org.moldavets.model.Impl;

import org.moldavets.model.AbstractManufacturingProcess;

public class LaptopManufacturingProcess extends AbstractManufacturingProcess {

    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assemble Laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("Test Laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Package Laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store Laptop");
    }
}
