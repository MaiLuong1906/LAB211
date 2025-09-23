/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1.short_08;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author LENOVO
 */
public class Couting {
    private String content;
    public Couting(String s){
        content = s;
    }
    public Map<Character, Integer> countLetter(){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char x: content.toCharArray()){
            if(x != ' ')
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        return map;
    }
    public Map<String, Integer> countWord(){
        Map<String, Integer> map = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(content);
        while(st.hasMoreTokens()){
            String words = st.nextToken();
            map.put(words, map.getOrDefault(words, 0)+1);
        }
        return map;
    }
    public void showCountLetter(){
        System.out.println(countLetter());
    }
    public void showCountWord(){
        System.out.println(countWord());
    }
}
