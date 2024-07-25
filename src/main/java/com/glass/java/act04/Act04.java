package com.glass.java.act04;

public class Act04 {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(2_000L);
        System.out.println(money1.plus(money2));
    }
}
