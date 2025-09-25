/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.short_74;

import view.Untils;

/**
 *
 * @author LENOVO
 */
public class Matrix {
    private int row, col;
    private int[][] matrix;
    
    public Matrix(int row, int col){
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }
    
    public void setMatrix(String name){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = Untils.getIntValue2(String.format("%s[%d][%d]", name,i+1, j+1));
            }
        }
    }
    
    public void printMatrix(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("[%d]", matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    public Matrix solve(Matrix other, char operator){
        Matrix res = new Matrix(row, col);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(operator == '+') res.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
                else res.matrix[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return res;
    }
    
    public Matrix multiple(Matrix other){
        Matrix res = new Matrix(row, other.col);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < other.col; j++){
                int sum = 0;
                for(int k = 0; k < this.col; k++){
                    sum += this.matrix[i][k] * other.matrix[k][j];
                }
                res.matrix[i][j] = sum;
            }
        }
        return res;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    
    
}
