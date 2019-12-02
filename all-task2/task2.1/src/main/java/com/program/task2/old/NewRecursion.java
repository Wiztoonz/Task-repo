package com.program.task2.old;

public class NewRecursion {
    public String changeString(String str) {
        StringBuilder changeBuilder = new StringBuilder();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int indexVowels = 0, indexStr = 0;
        return build(changeBuilder, str, indexStr, vowels, indexVowels);
    }

    private String build(StringBuilder changeBuilder, String str, int indexStr, char[] vowels, int indexVowels) {
        changeBuilder.append(str.charAt(indexStr));
        if (indexStr < str.length() - 1) {
            if (isVowel(str.charAt(indexStr), vowels, indexVowels) && str.charAt(indexStr + 1) != ' ') {
                changeBuilder.append("*");
            }
            if (isVowel(str.charAt(indexStr + 1), vowels, indexVowels) && str.charAt(indexStr) != ' ') {
                changeBuilder.append("*");
            }
        }
        indexStr++;
        return (str.length() == indexStr)
                ? new String(changeBuilder).replaceAll("\\*\\*", "\\*")
                : build(changeBuilder, str, indexStr, vowels, indexVowels);
    }

    private boolean isVowel(char symbol, char[] vowels, int indexVowels) {
        if (vowels[indexVowels] == symbol) { return true; }
        indexVowels++;
        return (vowels.length > indexVowels) && isVowel(symbol, vowels, indexVowels);
    }
}
