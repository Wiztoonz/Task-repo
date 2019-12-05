package com.program.task2.new_recursion;

public class Recursion {

    public String interviewRecursion(String str) {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        build(builder, str, index);
        return builder.toString();
    }

    private void build(StringBuilder builder, String str, int index) {
        char currentSymbol = str.charAt(index);
        System.out.println(currentSymbol);
        index++;
        if (isVowel(currentSymbol)) {
            if (index > 1) {
                builder.append("*");
            }
            builder.append(currentSymbol);
            if (index < str.length()) {
                char symbolAfter = str.charAt(index);
                if (!isVowel(symbolAfter)) {
                    builder.append("*");
                }
            }
        } else {
            builder.append(currentSymbol);
        }
        if (str.length() > index) {
            build(builder, str, index);
        }
    }

    // O(1) Когда берем индекс строки ("символ берется по индексу в методе build()") за одно действие проверяется гласная или нет.
    private boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }

}
