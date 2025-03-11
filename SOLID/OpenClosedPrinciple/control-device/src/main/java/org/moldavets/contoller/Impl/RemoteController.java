package org.moldavets.contoller.Impl;

import org.moldavets.contoller.Controller;
import org.moldavets.model.Switchable;

public class RemoteController implements Controller {

    private static final RemoteController INSTANCE = new RemoteController();
    private Switchable connectedDevice = null;

    public RemoteController() {
    }

    public static RemoteController getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Switchable device) {
        this.connectedDevice = device;
    }

    public void switchDeviceOn() {
        if (connectedDevice == null) {
            throw new NullPointerException("No connected device");
        }
        connectedDevice.switchOn();
    }

    public void switchDeviceOff() {
        if (connectedDevice == null) {
            throw new NullPointerException("No connected device");
        }
        connectedDevice.switchOff();
    }



}
