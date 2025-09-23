/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_08;

import view.Untils;

/**
 *
 * @author LENOVO
 */
public class RunShort_8 {
    public static void main(String[] args) {
        String content = Untils.getValue("your content");
        Couting count = new Couting(content);
        count.showCountWord();
        count.showCountLetter();
    }
}
