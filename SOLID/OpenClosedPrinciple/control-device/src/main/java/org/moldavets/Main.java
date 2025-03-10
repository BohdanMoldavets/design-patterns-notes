package org.moldavets;

import org.moldavets.model.AbstractDevice;
import org.moldavets.model.Impl.PlayStation;

public class Main {
    public static void main(String[] args) {
        AbstractDevice abstractDevice = new PlayStation(1L,"Ps5", false);
        abstractDevice.switchPower();
    }
}