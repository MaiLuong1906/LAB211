package week4.long21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    private Map<String, Student> listS = new HashMap<>();

    public boolean add(Student s){
        String key = s.getId()+ " | " + s.getSemester() + " | " + s.getCourse();
        if(listS.containsKey(key))return false;
        listS.put(key, s);
        return true;
    }

    public Map<String, Student> getListS() {
        return listS;
    }

    public void searchByName(String name){
        for(Student s: listS.values()){
            if(s.getName().contains(name)){
                System.out.println(s);
            }
        }
    }

    public Student findByID(String id){
        for(Student s: listS.values()){
            if(s.getId().contains(id)){
                System.out.println(s);
                return s;
            }
        }
        return null;
    }

    public void delete(Student s){
        String key = s.getId()+ " | " + s.getSemester() + " | " + s.getCourse();
        listS.remove(key, s);
    }

    public void update(Student s,String id, String name, String semester, String course){
        String oldKey = s.getId()+ " | " + s.getSemester() + " | " + s.getCourse();
        String newKey = id + " | " + semester + " | " + course;

        if(listS.containsKey(newKey)){
            System.out.println("Key "+ newKey + "already exit");
        }
        else{
            listS.remove(oldKey, s);
            s.setId(id);
            s.setName(name);
            s.setSemester(semester);
            s.setCourse(course);
            listS.put(newKey, s);
        }
    }

    public void sort(){
        ArrayList<Student> listSort = new ArrayList<>();
        for(Student s: listS.values()){
            listSort.add(s);
        }
        listSort.sort(Comparator.comparing(Student::getName));

        System.out.println(" ID       | Name                    |  Semester  | Course");
        for(Student s: listSort){
            System.out.println(s);
        }
    }

    public void report(){
        Map<String, Integer> res = new HashMap<>();
        for(Student s: listS.values()){
            String key = s.getId()+ " | " + s.getName() + " | "+ s.getCourse();
            res.put(key, res.getOrDefault(key, 0)+1);
        }
        for(Map.Entry<String, Integer> tmp : res.entrySet()){
            System.out.println(tmp.getKey()+" | "+tmp.getValue());
        }
    }


}
