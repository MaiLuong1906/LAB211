package week3.short_83;

public class RunShort_83 {
    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();

        ms.push(1);
        ms.push(3);
        ms.push(5);
        ms.push(7);
        ms.push(9);
        ms.push(2);
        ms.push(4);
        ms.showStack();
        try{
            System.out.println("Get value: "+ ms.get());
            ms.showStack();
            System.out.println("Pop value: "+ ms.pop());
            ms.showStack();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
