package com.company.strings.todo;

import java.util.Scanner;

//I             1
//IV            4
//V             5
//IX            9
//X             10
//XL            40
//L             50
//XC            90
//C             100
//CD            400
//D             500
//CM            900
//M             1000

public class RomanInteger {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            int number = in.nextInt();
            System.out.println(check(number));
        }
    }

    private static boolean check(int number) {
        while (number > 1) {
        }

        return false;
    }
}