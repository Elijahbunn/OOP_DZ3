package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SchoolClass newClass = new SchoolClass();
        newClass.addChild(new Child("Nikita", "Losovoi", 4));
        newClass.addChild(new Child("Nikita", "Nikiforov", 5));
        newClass.addChild(new Child("Elijah", "Voronin", 3));
        for(Child child : newClass){
            System.out.println(child);
        }
    }
}