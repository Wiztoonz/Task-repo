package com.program.task2;

public class Main {
    public static void main(String[] args) {
        // Прошлая реализация
        System.out.println("Прошлая реализация");
        Recursion recursion = new Recursion();
        String line = recursion.interviewRecursion("hello healo abc @!_=- oab");
        System.out.println(line);

        System.out.println();

        // Переделанная реализация
        System.out.println("Переделанная реализация");
        NewRecursion newRecursion = new NewRecursion();
        String result = newRecursion.changeString("hello healo abc @!_=- oab");
        System.out.println(result);
    }
}