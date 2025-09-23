/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_11;

import java.util.Stack;

/**
 *
 * @author LENOVO
 */
public class BaseConverter {
    private String input;
    private int baseIn;
    private int baseOut;

    public BaseConverter(String input, int baseIn, int baseOut) {
        this.input = input;
        this.baseIn = baseIn;
        this.baseOut = baseOut;
    }
    
    public int toDecimal() throws Exception{
        int decimal = 0;
        int powIndex = input.length() - 1;
        String process = input.toUpperCase().trim();
        for(int i = 0; i < process.length(); i++){
            char tmp = input.charAt(i);
            int digit;
            if(tmp >= '0' && tmp <='9'){
                digit = tmp - '0';
            }
            else if(tmp >= 'A' && tmp <='F'){
                digit = tmp -'A' +10;
            }
            else throw new Exception(process.charAt(i)+" is not valid");
            if(digit > baseIn) throw new Exception(tmp + " is not valid for base " + baseIn);
            decimal +=(digit * (int)Math.pow(baseIn, powIndex));
            powIndex --;
        }
        return decimal;
    }
    
    public String toOutBase() throws Exception{
        int decimal = toDecimal();
        if(decimal == 0)return "0";
        Stack<Integer> st = new Stack<>();
        while(decimal > 0){
            int rem = decimal % baseOut;
            st.push(rem);
            decimal /= baseOut;
        }
        StringBuilder rs = new StringBuilder();
        while(!st.isEmpty()){
            int tmp = st.pop();
            if (tmp > 9){
                char c = (char)(tmp -10 + 'A');
                rs.append(c);
            }
            else{
                rs.append(tmp);
            }
        }
        return rs.toString();
    }
    
}
