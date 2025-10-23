package week5.ShortP109;

import view.Untils;

import java.time.LocalDate;

public class CourseOffline extends Course{
    private LocalDate begin, end;
    private String campus;

    public CourseOffline(){
        super();
        campus = "";
    }

    @Override
    public void inputAll(){
        super.inputAll();
        begin = Untils.inputDate("begin");
        end = Untils.dateAfter("end", begin);
    }

    @Override
    public String toString() {
        return super.toString()+"CourseOffline{" +
                "begin=" + begin +
                ", end=" + end +
                ", campus='" + campus + '\'' +
                '}';
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
