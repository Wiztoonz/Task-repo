package com.program.task2.new_recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RecursionStr_v2 {

    private static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public String interviewRecursion(String str) {
        return build(str);
    }

    private String build(String text) {
        if (text.length() > 1) {
            char currentSymbol = text.charAt(0);
            char symbolAfter = text.charAt(1);
            boolean isCurrentSymbol = vowels.contains(currentSymbol);
            boolean isSymbolAfter = vowels.contains(symbolAfter);
            boolean isAddBefore = !isCurrentSymbol && isSymbolAfter;
            return currentSymbol + (isAddBefore || isCurrentSymbol ? "*" : "") + build(text.substring(1));
        }
        return text;
    }

}