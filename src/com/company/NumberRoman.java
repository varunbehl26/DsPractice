package com.company;

public class NumberRoman {

    public static void main(String[] args) {

        System.out.println(getRoman(1998));

    }

    private static String getRoman(int num) {
        while (num != 0) {

            if (num >= 1000)       // 1000 - m
            {
                System.out.print("m");
                num -= 1000;
            } else if (num >= 900)   // 900 -  cm
            {
                System.out.print("cm");
                num -= 900;
            } else if (num >= 500)   // 500 - d
            {
                System.out.print("d");
                num -= 500;
            } else if (num >= 400)   // 400 -  cd
            {
                System.out.print("cd");
                num -= 400;
            } else if (num >= 100)   // 100 - c
            {
                System.out.print("c");
                num -= 100;
            } else if (num >= 90)    // 90 - xc
            {
                System.out.print("xc");
                num -= 90;
            } else if (num >= 50)    // 50 - l
            {
                System.out.print("l");
                num -= 50;
            } else if (num >= 40)    // 40 - xl
            {
                System.out.print("xl");
                num -= 40;
            } else if (num >= 10)    // 10 - x
            {
                System.out.print("x");
                num -= 10;
            } else if (num >= 9)     // 9 - ix
            {
                System.out.print("ix");
                num -= 9;
            } else if (num >= 5)     // 5 - v
            {
                System.out.print("v");
                num -= 5;
            } else if (num >= 4)     // 4 - iv
            {
                System.out.print("iv");
                num -= 4;
            } else if (num >= 1)     // 1 - i
            {
                System.out.print("i");
                num -= 1;
            }

        }

        return "";
    }


}
