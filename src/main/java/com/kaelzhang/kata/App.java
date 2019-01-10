package com.kaelzhang.kata;

public class App {
    public static void main(String[] args){
        String slogan = getSlogan("hello");
        System.out.println(slogan);
    }

    public static String getSlogan(String action) {
        return action + " world!";
    }
}
