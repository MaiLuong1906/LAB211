package week4.short105;

import view.Menu;

public class Run extends Menu {

    private StudentManagement stm ;
    private TeacherManagement tm;
    private PersonManagement pm;
    private Storage st = new Storage();

    public Run(){
        super("Information Management", new String[]{"Teacher", "Student", "Person", "Exit"});
        stm = new StudentManagement(st);
        tm = new TeacherManagement(st);
        pm = new PersonManagement(st);
    }

    @Override
    public void execute(int ch) {
        switch (ch){
            case 1 ->{
                tm.run();
            }
            case 2 -> {
                stm.run();
            }
            case 3 -> {
                pm.run();
            }
        }
    }

    public static void main(String[] args) {
        Run o = new Run();
        o.run();
    }


}
