package org.moldavets.model.Impl;

import org.moldavets.exception.PowerException;
import org.moldavets.model.AbstractDevice;
import org.moldavets.model.Switchable;

public class SurroundSoundSystem extends AbstractDevice implements Switchable {

    @Override
    public void switchOn() {
        if (super.isWorked) {
            throw new PowerException("The device is already working.");
        }
        loginToSpotify();
        playTopMusic();
        super.isWorked = !super.isWorked;
    }

    @Override
    public void switchOff() {
        if (!super.isWorked) {
            throw new PowerException("The device is not working now.");
        }
        loginToSpotify();
        super.isWorked = !super.isWorked;
    }

    private void loginToSpotify() {
        System.out.println("Login to Spotify");
        playTopMusic();
    }

    private void logoutFromSpotify() {
        System.out.println("Logout from Spotify");
    }

    private void playTopMusic() {
        System.out.println("Playing \"Die With A Smile\" now!");
    }


}
