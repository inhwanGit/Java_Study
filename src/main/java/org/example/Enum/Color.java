package org.example.Enum;

public enum Color implements Printer{
    RED("FF0000"),
    BLUE("0000FF");

    private String rgb;
    private Color(String rgb){
        this.rgb = rgb;
    }

    @Override
    public void print(){
        System.out.println("rgb : " + rgb);
    }
}