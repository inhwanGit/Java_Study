package org.example.Enum;


import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] agrs){
        EnumMap emap = new EnumMap(Day.class);

        emap.put(Day.SUNDAY, "일요일은 잠자는 것이 최고.");
        emap.put(Day.FRIDAY, "불금!!");
        emap.put(Day.MONDAY, "월요병 ㅜㅜ");

        System.out.println(emap.get(Day.SUNDAY));
    }
}
