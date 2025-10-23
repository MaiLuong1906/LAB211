package week5.ShortP109;

import view.Untils;

public class Course {

    protected String courseID, courseName, type;
    protected int credits;

    public Course(){
        courseID = "";
        courseName = "";
        credits = 0;
        type = "";
    }

    public void inputAll(){
        courseID = Untils.getValue("Course ID");
        courseName = Untils.getValue("Course Name");
        credits = Untils.getIntValue("Credits");
        type = Untils.getValue("Type Course(Online/ Offline)");
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                '}';
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setType(String type) {
        this.type = type;
    }
}
