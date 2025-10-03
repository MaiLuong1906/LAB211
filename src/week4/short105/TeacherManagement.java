package week4.short105;

import view.Menu;

import java.util.*;

public class TeacherManagement extends Menu {

    private Storage stT;

    public TeacherManagement(Storage st){
        super("Teacher Management", new String[]{"Input", "Print", "Exit"});
        stT = st;
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
        Teacher t = new Teacher();
        t.inputAll();
        return stT.addTeacher(t);
    }

    public void print(){
        List<Teacher> listT = stT.getListTeacher();
        listT.sort(Comparator.comparing(Teacher :: getYearProfession));
        int i = 1;
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major - Year in the profession - Contact type - Salary coefficient");
        for(Teacher t : listT){
            System.out.println(i+" - "+ t);
            i++;
        }
    }

}
