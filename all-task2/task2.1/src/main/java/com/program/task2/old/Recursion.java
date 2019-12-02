package com.program.task2.old;

public class Recursion {

    private String[] vowels = {"a", "e", "i", "o", "u"};
    private StringBuilder lineResult;
    private StringBuilder buildResult;
    private StringBuilder lineBuildResult;
    private int lineIndex;
    private int buildIndex;
    private int lineBuildIndex;

    public Recursion() {
        lineIndex = 0;
        buildIndex = 0;
        lineBuildIndex = 0;
        lineResult = new StringBuilder();
        buildResult = new StringBuilder();
        lineBuildResult = new StringBuilder();
    }

    // цикл поиска гласных
    private String concatLoop(int letterIndex, int vowelsSize, String lineLetter) {
        if (vowelsSize <= letterIndex) return lineLetter;

            if (lineLetter.toLowerCase().contains(vowels[letterIndex])) {
                lineResult.append("*").append(lineLetter).append("*");

                lineLetter = "";
            }

        letterIndex++;
        return concatLoop(letterIndex, vowelsSize, lineLetter);
    }

    // построение строки
    private String recursionLine(String[] lineLetters) {
        int letterIndex = 0;

        if (lineIndex == lineLetters.length) {
            return new String(lineResult);
        }

        lineResult.append(concatLoop(letterIndex, vowels.length, lineLetters[lineIndex]));
        lineIndex++;
        return recursionLine(lineLetters);
    }

    // очистка лишних символов и построение строки:
    private String resultRecursionLine(String[] lineLetters) {
        if (buildIndex == lineLetters.length) {
            return new String(buildResult).replaceAll("[\\*]+", "*");
        }

        if (lineLetters.length - 1 > buildIndex) {
            String checkSymbols = lineLetters[buildIndex] + lineLetters[buildIndex + 1].replaceAll("[\\*]+", " ");
            if (checkSymbols.equals("* ") || checkSymbols.equals(" *")) {
                lineLetters[buildIndex] = "";
            }
        }

        if (lineLetters.length % 2 == 0) {
            buildResult.append(lineLetters[buildIndex]);
        }
        if (lineLetters.length % 2 == 1) {
            buildResult.append(lineLetters[buildIndex]);
        }


        buildIndex++;
        return resultRecursionLine(lineLetters);
    }

    // построение строки только с прилегающими гласными
    private String resultLongRecursionLine(String[] lineLetters) {
        if (lineBuildIndex == lineLetters.length) {
            return new String(lineBuildResult).trim();
        }

        if (lineLetters[lineBuildIndex].startsWith("*")) {
            lineBuildResult.append(lineLetters[lineBuildIndex].substring(1)).append(" ");
        } else if (lineLetters[lineBuildIndex].endsWith("*")) {
            lineBuildResult.append(lineLetters[lineBuildIndex], 0, lineLetters[lineBuildIndex].length()-1).append(" ");
        } else {
            lineBuildResult.append(lineLetters[lineBuildIndex]).append(" ");
        }

        lineBuildIndex++;
        return resultLongRecursionLine(lineLetters);
    }

    public String interviewRecursion(String line) {
        String[] lineLetters = line.split("");
        String recursionLine = recursionLine(lineLetters);

        String[] recursionLineLetters = recursionLine.split("");
        String resultLine = resultRecursionLine(recursionLineLetters);

        String[] longLine = resultLine.split("[\\s]+");

        return resultLongRecursionLine(longLine);
    }

}