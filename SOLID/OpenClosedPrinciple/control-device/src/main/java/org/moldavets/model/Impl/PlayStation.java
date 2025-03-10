package org.moldavets.model.Impl;

import org.moldavets.model.AbstractDevice;

public class PlayStation extends AbstractDevice {

    protected boolean isTvWorking = false;

    public PlayStation(Long id, String name, boolean isWorked) {
        super(id, name, isWorked);
    }

    @Override
    public void switchPower() {
        if (this.isWorked) {
            switchTv();
            logoutFromAccount();
            this.isWorked = false;
        } else {
            switchTv();
            loginToAccount();
            this.isWorked = true;
        }
    }

    private void loginToAccount() {
        System.out.println("Login to account successfully");
    }

    private void logoutFromAccount() {
        System.out.println("Logout from account successfully");
    }

    private void switchTv() {
        if (this.isTvWorking) {
            isTvWorking = false;
            System.out.println("Turning off tv");
        } else {
            isTvWorking = true;
            System.out.println("Turning on tv");
        }
    }


}
