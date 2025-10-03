package week4.short105;

import view.Untils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Person {
    protected String id;
    protected String name;
    protected long phoneNumber;
    protected int year;
    protected String major;

    public Person(){
        id = "";
        name = "";
        phoneNumber = 0;
        year = 0;
        major = "";
    }

    public void inputAll(){
        id = Untils.inputID("ID", 6);
        name = Untils.getName("Fullname");
        phoneNumber = Untils.getNumberWith("Phone number", 12);
        year = Untils.getYear("Year of birth");
        major = Untils.inputWith("Major", 30);
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
