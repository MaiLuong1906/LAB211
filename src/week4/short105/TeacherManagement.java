package week4.short105;

import view.Menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TeacherManagement extends Menu {
    private Map<Integer, Teacher> listT = new HashMap<>();
    public TeacherManagement(){
        super("Teacher Management", new String[]{"Input", "Print", "Exit"});
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
        if(listT.containsKey(t.getId())) return false;
        listT.put(t.getId(), t);
        return true;
    }

    public void print(){
        ArrayList<Teacher> list = new ArrayList<>(listT.values());
        list.sort(Comparator.comparing(Teacher :: getYearProfession));
        int i = 1;
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major - Year in the profession - Contact type - Salary coefficient");
        for(Teacher t : list){
            System.out.println(i+" - "+ t);
            i++;
        }
    }

    public static void main(String[] args) {
        TeacherManagement tm = new TeacherManagement();
        tm.run();
    }
}
