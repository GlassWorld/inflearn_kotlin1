package com.glass.java.act08;

public class Act08 {

    public static void main(String[] args) {

    }

    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public void repeat(String str, int num, boolean useNewLine) {
        for(int i = 0; i < num; i++) {
            if(useNewLine){
                System.out.println(str);
            }else{
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }
}
