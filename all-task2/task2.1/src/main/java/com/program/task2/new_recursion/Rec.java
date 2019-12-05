package com.program.task2.new_recursion;

public class Rec {

    void combine(String str) {
        int length = str.length();
        char[] instr = str.toCharArray();
        StringBuilder outstr = new StringBuilder();
        doCombine(instr, outstr, length, 0, 0);
    }

    void doCombine(char[] instr, StringBuilder outstr, int length, int level, int start) {
        for (int i = start; i < length; i++) {
            outstr.append(instr[i]);
            System.out.println(outstr);
            if (i < length - 1) {
                doCombine(instr, outstr, length, level + 1, i + 1);
            }
            outstr.setLength(outstr.length() - 1);
        }
    }

    public static void main(String[] args) {
        Rec rec = new Rec();
        rec.combine("0123456789");
    }

}
