package com.program.task2;

public class NewRecursion {
    public String changeString(String str) {
        StringBuilder changeBuilder = new StringBuilder();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int indexVowels = 0;

        for (int i = 0; i < str.length(); i++) {
            changeBuilder.append(str.charAt(i));
            if (i < str.length() - 1) {
                if (isVowel(str.charAt(i), vowels, indexVowels) && str.charAt(i + 1) != ' ') {
                    changeBuilder.append("*");
                }
                if (isVowel(str.charAt(i + 1), vowels, indexVowels) && str.charAt(i) != ' ') {
                    changeBuilder.append("*");
                }
            }
        }
        return new String(changeBuilder).replaceAll("\\*\\*", "\\*");
    }

    private boolean isVowel(char symbol, char[] vowels, int indexVowels) {
        if (vowels[indexVowels] == symbol) return true;
        indexVowels++;
        return (vowels.length > indexVowels) && isVowel(symbol, vowels, indexVowels);
    }
}
