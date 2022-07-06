package com.ll.exam;

public class Calculator {
    public static int calc(String s) {
        boolean isMinus = s.indexOf('-') != -1;
        boolean isMulti = s.indexOf('*') != -1;
        if (isMinus) {
            return carcMinus(s);
        }
        else if(isMulti){
            return carcMulti(s);
        }
        else {
            return carcPlus(s);
        }
    }

    private static int carcMulti(String s) {
        String[] sBits = s.split("\\*");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    private static int carcPlus(String s) {
        String[] sBits = s.split("\\+");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int carcMinus(String s) {
        String[] sBits = s.split("\\-");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

}