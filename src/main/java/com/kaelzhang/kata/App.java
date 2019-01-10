package com.kaelzhang.kata;

public class App {
    public static void main(String[] args){
        String slogan = getSlogan("hello");
        System.out.println(slogan);
    }

    public String interf(boolean isUpdate){
        String val = "query";
        if (isUpdate){
            val = "update";
        }

        return val;
    }

    public static String getSlogan(String action) {
        return action + " world!";
    }
}
