package org.moldavets;


import org.moldavets.contoller.Impl.RemoteController;
import org.moldavets.model.Impl.PlayStation;
import org.moldavets.model.Impl.Projector;
import org.moldavets.model.Switchable;

public class Main {
    public static void main(String[] args) {
        Switchable playStation = new PlayStation();
        Switchable projector = new Projector();

        RemoteController remoteController = RemoteController.getInstance();
        remoteController.connectToDevice(playStation);
        remoteController.switchDeviceOn();
        remoteController.switchDeviceOff();

        remoteController.connectToDevice(projector);
        remoteController.switchDeviceOn();
        remoteController.switchDeviceOff();
    }
}