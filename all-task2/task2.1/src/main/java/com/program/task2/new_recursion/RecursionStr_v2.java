package com.program.task2.new_recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RecursionStr_v2 {

    public String interviewRecursion(String str) {
        String text = new String(str);
        return build(text);
    }

    private String build(String text) {
        if (text.length() > 1) {
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            char currentSymbol = text.charAt(0);
            char symbolAfter = text.charAt(1);
            boolean isCurrentSymbol = vowels.contains(currentSymbol);
            boolean isSymbolAfter = vowels.contains(symbolAfter);
            if (!isCurrentSymbol && isSymbolAfter) {
                return currentSymbol + "*" + build(text.substring(1));
            }
            if (isCurrentSymbol) {
                return currentSymbol + "*" + build(text.substring(1));
            }
            return currentSymbol + build(text.substring(1));
        }
        return text;
    }

}
