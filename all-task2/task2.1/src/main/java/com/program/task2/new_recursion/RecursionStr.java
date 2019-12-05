package com.program.task2.new_recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RecursionStr {

    public String interviewRecursion(String str) {
        String text = new String(str);
        return build(text);
    }

    private String build(String text) {
        if (text.length() > 0) {
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            char currentSymbol = text.charAt(0);
            boolean isCurrentSymbol = isVowel(currentSymbol, vowels);
            if (text.length() > 1) {
                char symbolAfter = text.charAt(1);
                if (!isCurrentSymbol && isVowel(symbolAfter, vowels)) {
                    return currentSymbol + "*" + build(text.substring(1));
                }
            }
            if (isCurrentSymbol) {
                if (text.charAt(text.length() - 1) == currentSymbol) {
                    return currentSymbol + "";
                }
                return currentSymbol + "*" + build(text.substring(1));
            }
            return currentSymbol + build(text.substring(1));
        }
        return text;
    }

    private boolean isVowel(char symbol, Set<Character> vowels) {
        return vowels.contains(symbol);
    }

}
