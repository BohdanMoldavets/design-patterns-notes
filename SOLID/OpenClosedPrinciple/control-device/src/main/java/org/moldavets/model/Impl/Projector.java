package org.moldavets.model.Impl;

import org.moldavets.exception.PowerException;
import org.moldavets.model.AbstractDevice;
import org.moldavets.model.Switchable;

public class Projector extends AbstractDevice implements Switchable {

    @Override
    public void switchOn() {
        if(super.isWorked) {
            throw new PowerException("The device is already working.");
        }
        loginToNetflix();
        playNewFilm();
        super.isWorked = !super.isWorked;
    }

    @Override
    public void switchOff() {
        if(!super.isWorked) {
            throw new PowerException("The device is not working now.");
        }
        logoutFromNetflix();
        super.isWorked = !super.isWorked;
    }

    private void loginToNetflix() {
        System.out.println("Login to Netflix");
    }

    private void logoutFromNetflix() {
        System.out.println("Logout from Netflix");
    }

    private void playNewFilm() {
        System.out.println("Playing \"Marvel\" now!");
    }
}
