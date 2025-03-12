package org.moldavets.model;

public class SchoolStaff {

    protected String name;

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
    }

    private void conductHallwayDuties() {
        System.out.println("Conduct Hallway Duties");
    }

    private void collectPaperWork() {
        System.out.println("Collect paper work");
    }

    private void takeAttendence() {
        System.out.println("Take attendance");
    }

    private void makeAnnouncements() {
        System.out.println("Making an announcement");
    }

}
