package com.program.task2.old;

public class SimpleRecursion {

    public String interviewRecursion(String str) {
        StringBuilder changeBuilder = new StringBuilder();
        int indexStr = 0;
        return build(changeBuilder, str, indexStr);
    }

    private String build(StringBuilder changeBuilder, String str, int indexStr) {
        char symbol = str.charAt(indexStr);
        if (indexStr > 0) { addStar(changeBuilder, symbol); }
        changeBuilder.append(symbol);
        if (indexStr < str.length() - 1) { addStar(changeBuilder, symbol); }
        indexStr++;
        return (str.length() == indexStr)
                ? new String(changeBuilder).replaceAll("\\*\\*", "\\*") // replaceAll выполняется один раз
                : build(changeBuilder, str, indexStr);
    }

    // O(1) Когда берем индекс строки ("символ берется по индексу в методе build()") за одно действие проверяется гласная или нет.
    private boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }

    private void addStar(StringBuilder changeBuilder, char symbol) {
        if (isVowel(symbol)) {
            changeBuilder.append("*");
        }
    }

}
