/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import view.Menu;
import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_74 extends Menu{
    public RunShort_74(){
        super("Calculator program", new String[]{"Addition matrix",
                                                 "Subtraction matrix", "Multiplication matrix",
                                                 "Exit"});
    }

    @Override
    public void execute(int ch) {
        switch (ch){
            case 1 -> solution('+');
            case 2 -> solution('-');
            case 3 -> solution('*');
        }
    }
    
    public void printSolution(Matrix m1, Matrix m2, Matrix rs, char ope){
        System.out.println("-------Result-------");
        m1.printMatrix();
        System.out.println(ope);
        m2.printMatrix();
        System.out.println("=");
        rs.printMatrix();
    }
    
    public void solution(char operator){
        int row1 = Untils.getIntValue("Row Matrix 1");
        int col1 = Untils.getIntValue("Colum Matrix 1");
        Matrix matrix1 = new Matrix(row1, col1);
        matrix1.setMatrix("Matrix 1");
        while(true){
            int row2 = Untils.getIntValue("Row Matrix 2");
            int col2 = Untils.getIntValue("Colum Matrix 2");
            if(operator == '*' && col1 != row2){
                    System.out.println("The number of columns in Matrix 1 must be equal to the number of rows in Matrix 2.");
                    continue;
            }
            else{
                if(operator != '*' &&(row1 != row2 || col1 != col2)){
                    System.out.println("Two matrices of different sizes cannot be " + operator);
                    continue;
                }
            }
            Matrix matrix2 = new Matrix(row2, col2);
            matrix2.setMatrix("Matrix 2");
            Matrix res ;
            if(operator !='*')
                res = matrix1.solve(matrix2, operator);
            else
                res = matrix1.multiple(matrix2);
            printSolution(matrix1, matrix2, res, operator);
            return;
        }
            
    }
    public static void main(String[] args) {
        RunShort_74 r = new RunShort_74();
        r.run();
    }
}
