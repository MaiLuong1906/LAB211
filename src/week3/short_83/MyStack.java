package week3.short_83;

import java.util.LinkedList;

public class MyStack <T>{
    LinkedList<T> stackValues;

    public MyStack(){
        stackValues = new LinkedList<>();
    }

    public boolean isEmpty(){
        return stackValues == null;
    }

    public void push(T val){
        stackValues.addFirst(val);
    }

    public T pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        return stackValues.removeFirst();
    }

    public T get() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        return stackValues.getFirst();
    }

    public void showStack() {
        System.out.println("Stack: "+ stackValues);
    }
}
