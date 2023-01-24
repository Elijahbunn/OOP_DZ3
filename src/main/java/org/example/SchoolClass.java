package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SchoolClass implements Iterable<Child>{
    private List<Child> school_class = new ArrayList<>();
    public void addChild(Child child){
        school_class.add(child);
    }

    @Override
    public Iterator<Child> iterator() {
        return new Iterator<Child>() {
            private int current_index = 0;
            @Override
            public boolean hasNext() {
                return current_index < school_class.size();
            }

            @Override
            public Child next() {
                return school_class.get(current_index++);
            }
        };
    }
}
