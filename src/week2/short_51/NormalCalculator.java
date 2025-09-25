/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.short_51;

/**
 *
 * @author LENOVO
 */
public class NormalCalculator {
    private double memory;
    public NormalCalculator(double val){
        memory = val;
    }
    public double cal(char operator, double val) throws Exception{
        switch (operator) {
            case '+' -> memory += val;
            case '-' -> memory -= val;
            case '/' -> {
                if (val == 0) throw new Exception("Cannot divide by 0");
                memory /= val;
            }
            case '*' -> memory *= val;
            case '^' -> memory = Math.pow(memory, val);
        }
        return memory;
    }
    public void show(String prompt){
        System.out.println(prompt + ": "+ memory);
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}
