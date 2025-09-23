/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_50;

/**
 *
 * @author LENOVO
 */
public class SuperlativeEquation extends Equation{
    private int a, b;
    public SuperlativeEquation(int a, int b){
        super(a,b);
        this.a = a;
        this.b = b;
    }

    @Override
    public String solve() {
        StringBuilder solution = new StringBuilder("Solution: ");
        if(a == 0){
            if(b == 0){
                solution.append("x has infinitely many solutions.");
            }
            else{
                solution.append("x has no solution.");
            }
        }
        else {
            double rs = -b / (a * 1.0);
            solution.append(String.format("x = %.2f", rs));
        }
        return solution.toString();
    }
    
}
