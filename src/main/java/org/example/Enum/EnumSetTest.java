package org.example.Enum;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {
    public static void main(String[] agrs){
        EnumSet eset = EnumSet.allOf(Day.class);

        Iterator<Day> dayIter = eset.iterator();

        while(dayIter.hasNext()){
            Day day = dayIter.next();
            System.out.println(day);
        }
    }
}
