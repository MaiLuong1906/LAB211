package week4.short105;

import view.Menu;
import view.Untils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PersonManagement extends Menu {
    private Storage stP;

    public PersonManagement(Storage st){
        super("Person Management", new String[]{"Search", "Print", "Exit"});
        stP = st;
    }

    @Override
    public void execute(int ch) {
        switch (ch){
            case 1 -> {
                String name = Untils.getName("Name to search");
                searchByName(name);
            }
            case 2 -> {
                print();
            }
        }

    }

    public void searchByName(String name){
        for(Person p: stP.getListPerson()){
            if(p.getName().contains(name)){
                System.out.println(p);
            }
        }
    }

    public void print(){
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major");
        for(Person p: stP.getListPerson()){
            System.out.println(p);
        }
    }


}
