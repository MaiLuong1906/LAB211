package view;

import java.util.ArrayList;

public abstract class Menu {
    private String title;
    private ArrayList choices;

    public Menu() {
        choices= new ArrayList();
    }

    public Menu(String title, String[] mchon){
        this.title = title;
        choices= new ArrayList<>();
        for(String m:mchon) choices.add(m);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList choices) {
        this.choices = choices;
    }
//----------------------------------------------------
    public void display(){
        System.out.println("================== "+title+" ==================");
        System.out.println("-------------------");
        for(int i=0; i<choices.size();i++){
            System.out.println((i+1)+". "+choices.get(i));
        }
        System.out.println("-------------------");
    }
//----------------------------------------------------
    public int getSelected(){
        display();
        return Untils.getIntValue("Enter your choice");
    }    
//----------------------------------------------------
    public abstract void execute(int ch);    
//----------------------------------------------------
    public void run(){
        while(true){
            
            int ch=getSelected();          
            if(ch<choices.size()) execute(ch);
            else break;
        }
    }    

}
