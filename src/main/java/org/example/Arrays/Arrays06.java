package org.example.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays06 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("C#", 4000);
        items[2] = new Item("Python", 1000);
        items[3] = new Item("자바스크립트", 1000);
        items[4] = new Item("다트", 9000);

        // sort(Object[]) -> Object는 모든 객체의 조상이니깐 어떤 객체의 배열이든 올 수 있다
        // java.lang.ClassCastException 객체를 정렬할려면 기준을 정렬해줘야된다.
        // sort는 Comparator를 사용할 수 있다.
        Arrays.sort(items, new ItemSorter());

        for(Item item : items){
            System.out.println(item);
        }

    }
}

class ItemSorter implements Comparator{
    // o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

class Item{
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
