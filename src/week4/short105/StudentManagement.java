package week4.short105;

import view.Menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement extends Menu{
    private Map<Integer, Student> listS = new HashMap<>();

    public StudentManagement(){
        super("Student Management", new String[]{"Input", "Print", "Exit"});
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
        if(listS.containsKey(s.getId())) return false;
        listS.put(s.getId(), s);
        return true;
    }

    public void print(){
        ArrayList<Student> list = new ArrayList<>(listS.values());
        list.sort(Comparator.comparing(Student :: getYearAdmiss));
        int i = 1;
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major - Year of admission - Entrance English score ");
        for(Student s : list){
            System.out.println(i+" - "+ s);
            i++;
        }
    }


}
