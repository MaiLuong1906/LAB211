package week5.ShortP109;

import view.Untils;

public class CourseOnline extends Course{
    private String platforms, instructors, note;
    public CourseOnline(){
        super();
        platforms = "";
        instructors = "";
        note = "";
    }
    @Override
    public void inputAll(){
        super.inputAll();
        platforms = Untils.getValue("Platforms");
        instructors = Untils.getValue("Instructors");
        note = Untils.getValue("Note");
    }

    @Override
    public String toString() {
        return super.toString()+"CourseOnline{" +
                "platforms='" + platforms + '\'' +
                ", instructors='" + instructors + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
