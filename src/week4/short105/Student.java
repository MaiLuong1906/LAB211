package week4.short105;

import view.Untils;

import java.time.LocalDate;

public class Student extends Person{
    private int yearAdmiss;
    private double entranceScore;

    public Student(){
        super();
        yearAdmiss = 0;
        entranceScore = 0;
    }

    @Override
    public void inputAll(){
        super.inputAll();
        yearAdmiss = Untils.getIntWith("Year admission", year, LocalDate.now().getYear());
        entranceScore = Untils.inputScore("Entrance English score");
    }

    public int getYearAdmiss() {
        return yearAdmiss;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + phoneNumber + " - " + year+ " - " + major+" - "+ yearAdmiss + " - " + entranceScore;
    }
}
