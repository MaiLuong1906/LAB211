package week3.short_6;

import view.Untils;
import week1.short_10.Search;

public class RunShort_6 {
    public static void main(String[] args) {
        int n = Untils.getIntValue("number of array");
        Search search = new Search(n);
        int x = Untils.getIntValue2("number to search");
        int found = search.runBinarySearch(x);
        if(found > 0){
            System.out.println("Found "+ x+ " at "+found+" index.");
        }
        else{
            System.out.println(x+" not found.");
        }
    }
}
