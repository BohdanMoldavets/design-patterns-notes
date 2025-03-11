package org.moldavets.model;

abstract public class AbstractManufacturingProcess {

    private String processName;

    public AbstractManufacturingProcess(String processName) {
        this.processName = processName;
    }

    public void launchProcess() {
        if(processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("Process name is empty");
        }
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

}
