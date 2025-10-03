package week4.short105;

import view.Untils;

public class Person {
    protected int id;
    protected String name;
    protected long phoneNumber;
    protected int year;
    protected String major;

    public Person(){
        id = 0;
        name = "";
        phoneNumber = 0;
        year = 0;
        major = "";
    }
        // ID, full name, phone number, year of birth, major
        //ID is a 6 digits
        //● Fullname is alphabet and blanks
        //● Phone number is 12 digits
        //● Year of birth must be before current year
        //● Major is a string no more than 30 characters

    public void inputAll(){
        id = Untils.inputID("ID");
        name = Untils.getValue("Fullname");
        phoneNumber = Untils.getNumberWith("Phone number", 12);
        year = Untils.getYear("Year of birth");
        major = Untils.inputWith("Major", 30);
    }

    public int getId(){
        return id;
    }

}
