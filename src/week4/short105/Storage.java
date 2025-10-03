package week4.short105;

import java.util.*;

public class Storage {
    private Map<String, Person> listP = new LinkedHashMap<>();
    private List<Student> listS = new ArrayList<>();
    private List<Teacher> listT = new ArrayList<>();

    public boolean addStudent(Student s){
        if(listP.containsKey(s.getId())){
            System.out.println("ID already exits");
            return false;
        }
        listS.add(s);
        listP.put(s.getId(), s);
        return true;
    }

    public boolean addTeacher(Teacher t){
        if(listP.containsKey(t.getId())){
            System.out.println("ID already exits");
            return false;
        }
        listT.add(t);
        listP.put(t.getId(), t);
        return true;
    }

    public List<Teacher> getListTeacher(){
        return listT;
    }

    public List<Student> getListStudent(){
        return listS;
    }

    public List<Person> getListPerson(){
        List<Person> list = new ArrayList<>(listP.values());
        return list;
    }

}
