package org.moldavets.model.Impl;

import org.moldavets.model.CourseInstructor;
import org.moldavets.model.SchoolStaff;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Teaching English..");
    }
}
