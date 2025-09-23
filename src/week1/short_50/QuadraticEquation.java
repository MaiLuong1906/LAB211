/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_50;

/**
 *
 * @author LENOVO
 */
public class QuadraticEquation extends Equation{
    private int a, b, c;
    public QuadraticEquation(int a, int b, int c){
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String solve() {
        StringBuilder solution = new StringBuilder("Solution: ");
        if(a == 0){
            if(b == 0){
                if(c ==0){
                    solution.append("x has infinitely many solutions.");
                }
                else 
                    solution.append("x has no solution.");
            }
            else {
                double rs = -c / (b *1.0);
                solution.append(String.format("x = %.2f", rs));
            }
        }
        else{
            int delta = b*b - 4*a*c;
            if(delta < 0)
                solution.append("x has no solution");
            else if(delta == 0){
                double rs = - b /(2.0 *a);
                solution.append(String.format("x1 = x2 = %.2f", rs));
            }
            else{
                double sqrtD = Math.sqrt(delta);
                double x1 = (-b + sqrtD)/(2.0*a);
                double x2 = (-b - sqrtD)/(2.0*a);
                solution.append(String.format("x1 = %.2f, x2 = %.2f", x1, x2));
            }
        }
        return solution.toString();
    }
}
