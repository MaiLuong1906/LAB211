package week4.short105;

import view.Menu;

import java.util.*;

public class StudentManagement extends Menu{
    private Storage stS;

    public StudentManagement(Storage st){
        super("Student Management", new String[]{"Input", "Print", "Exit"});
        stS = st;
    }

    @Override
    public void execute(int ch) {
        switch (ch){
            case 1 -> {
                if(add()){
                    System.out.println("Add Successful");
                }
                else{
                    System.out.println("Add Fail");
                }
            }
            case 2 -> {
                print();
            }
        }
    }


    public boolean add(){
        Student s = new Student();
        s.inputAll();
        return stS.addStudent(s);
    }

    public void print(){
        List<Student> listS = stS.getListStudent();
        listS.sort(Comparator.comparing(Student :: getYearAdmiss));
        int i = 1;
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major - Year of admission - Entrance English score ");
        for(Student s : listS){
            System.out.println(i+" - "+ s);
            i++;
        }
    }

}
