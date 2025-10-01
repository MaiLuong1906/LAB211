package week4.long21;

import view.Menu;
import view.Untils;

public class SystemManagement extends Menu {

    private StudentManagement list;
    public SystemManagement(){
        super("WELCOME TO STUDENT MANAGEMENT", new String[]{"Create", "Find", "Sort",
                                                                 "Update/Delete", "Report", "Exit"});
        list = new StudentManagement();
        sampleStudent();
    }

    @Override
    public void execute(int ch) {
        switch (ch){
            case 1 ->{
                create();
            }
            case 2 ->{
                String name = Untils.getValue("name to find");
                list.searchByName(name);
            }
            case 3 ->{
                list.sort();
            }
            case 4 ->{
                updateOrDelete();
            }
            case 5 ->{
                list.report();
            }
        }
    }

    public void create(){
        int i = 0;
        while(true){
            System.out.println("You must create at least  3 students!");
            int j = 0;
            while(j < 3){
                System.out.println("Add inforstudent "+ (i+1));
                boolean check = addStudent();
                if(!check) {
                    System.out.println("Add fail !, Key(id, semester, course) may already exist");
                    System.out.println("Enter again !");
                    continue;
                }
                System.out.println("Add successful !");
                i++; j++;
            }
            System.out.println("Do you want to continue (Y/N)?");
            String choice = Untils.getValue("choice");
            if(choice.equalsIgnoreCase("Y")) continue;
            break;
        }
    }

    public boolean addStudent(){
        String id = Untils.getValue("ID");
        String name = Untils.getValue("name");
        String semester = Untils.getValue("semester");
        String course = Untils.getValue("course");
        return list.add(new Student(id, name, semester, course));
    }

    // Sample
    public void sampleStudent(){
        Student st1 = new Student("DE01", "Mai Van Luong", "FAL23", "JAVA");
        Student st2 = new Student("DE02", "Gia Cat Luong", "FAL24", "PYTHON");
        Student st3 = new Student("DE03", "Tu Ma Y", "SU25", "Web Design");
        list.add(st1);
        list.add(st2);
        list.add(st3);
    }

    public void updateOrDelete(){
        String id = Untils.getValue("ID of student");
        Student found = list.findByID(id);
        if(found != null){
            System.out.println("Do you want to update (U) or delete (D) student");
            char choice = Untils.getValue("your choice").charAt(0);
            switch (choice){
                case 'U' -> {
                    System.out.println("Update information:");
                    String id2 = Untils.getValue("ID");
                    String name = Untils.getValue("name");
                    String semester = Untils.getValue("semester");
                    String course = Untils.getValue("course");
                    list.update(found, id2, name, semester, course);
                }
                case 'D' -> {
                    list.delete(found);
                }
            }
        }
        else {
            System.out.println("ID doesn't found");
        }
    }


}
