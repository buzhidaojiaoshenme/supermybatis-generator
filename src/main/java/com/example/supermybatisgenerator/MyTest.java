package com.example.supermybatisgenerator;

public class MyTest {

    public static void main(String[] args) {
        System.out.println("=========================================================");
        String s = "md_material";
        String[] split = s.split(",");
        for (String s1 : split) {
            System.out.println(s1);
        }
        System.out.println("=========================================================");
    }
}
