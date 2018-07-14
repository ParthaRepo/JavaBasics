package com.partharepo.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaArrayList {
    /** This is the sample method that helps us to filter the arrayList**/
    public static void main(String args[]){
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);
    }
}
