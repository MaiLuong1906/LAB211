package week4.short105;

import view.Untils;

import java.time.LocalDate;

public class Teacher extends Person{
    private int yearProfession;
    private String contractType;
    private double salary;

    public Teacher(){
        super();
        yearProfession = 0;
        contractType = "";
        salary = 0;
    }

    @Override
    public void inputAll(){
        super.inputAll();
        yearProfession = Untils.getIntWith("Year in the profession", 0,LocalDate.now().getYear() - year);
        contractType = Untils.getValue("Contract type (Long-Short)");
        salary = Untils.getDouble1("Salary");
    }

    public int getYearProfession() {
        return yearProfession;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + phoneNumber + " - " + year+ " - " + major+" - "+ yearProfession + " - " + contractType + " - " + salary;
    }
}
