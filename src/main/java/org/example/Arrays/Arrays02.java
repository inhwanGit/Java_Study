package org.example.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        char[] copyFrom = {'h','e','l','l','o','!'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 5); //copyOfRange(복사할 배열, 몇번째배열부터(form), 몇번째배열까지(to))

        for(char c : copyTo){
            System.out.println(c);
        }
    }
}
