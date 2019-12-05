package com.program.task2.new_recursion;

public class Main {

    public static void main(String[] args) {

//        Recursion recursion = new Recursion();
//        String recursion1 = recursion.interviewRecursion("hello");
//        String recursion2 = recursion.interviewRecursion("healo");

//        System.out.println(recursion1);
//        System.out.println(recursion2);


        RecursionStr rec = new RecursionStr();
        System.out.println(rec.interviewRecursion("abc"));
        System.out.println(rec.interviewRecursion("hello"));
        System.out.println(rec.interviewRecursion("abc"));
        System.out.println(rec.interviewRecursion("healo"));

    }

}
