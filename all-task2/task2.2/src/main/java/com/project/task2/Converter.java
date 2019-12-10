package com.project.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter {

    public String bitConverter(char symbol) {
        StringBuilder builder = new StringBuilder("00 0 ");

        String bits = Integer.toBinaryString(symbol);
        List<String> groupBits = getGroupBits(bits);

        for (String bit : groupBits) {
            builder.append((bit.charAt(0) == '1') ? "0 " + bit : " 00 " + bit + " ");
        }
        return new String(builder).trim().replaceAll("1", "0");
    }

    private List<String> getGroupBits(String bits) {
        List<String> bitsLine = new ArrayList<>();
        Matcher matcher = Pattern.compile("(0+)|(1+)").matcher(bits);
        while (matcher.find()) {
            bitsLine.add(matcher.group());
        }
        return bitsLine;
    }

}
