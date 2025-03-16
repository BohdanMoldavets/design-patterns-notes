package org.moldavets.model.Impl;

import org.moldavets.exception.PowerException;
import org.moldavets.model.AbstractDevice;
import org.moldavets.model.Switchable;

public class PlayStation extends AbstractDevice implements Switchable {

    @Override
    public void switchOn() {
        if (super.isWorked) {
            throw new PowerException("The device is already working.");
        }
        loginToAccount();
        super.isWorked = !super.isWorked;
    }

    @Override
    public void switchOff() {
        if (!super.isWorked) {
            throw new PowerException("The device is not working now.");
        }
        logoutFromAccount();
        super.isWorked = !super.isWorked;
    }

    private void loginToAccount() {
        System.out.println("Login to playstation successfully");
    }

    private void logoutFromAccount() {
        System.out.println("Logout from playstation successfully");
    }
}
