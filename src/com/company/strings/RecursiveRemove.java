package com.company.strings;

import java.util.Scanner;


//instead of checking the string only appended the needed in string
public class RecursiveRemove {
    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        while (tests-- != 0) {
            String val = in.next();

            check(val);

        }
    }

    private static void check(String str) {
        if (str.length() <= 1) {
            System.out.println(str);
            return;
        }
        StringBuilder newString = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                if (i < str.length() - 2 && str.charAt(i) != str.charAt(i + 2))
                    i += 2;
                else
                    i++;
                count++;
            }
            if (i != str.length() - 1)
                newString.append(str.charAt(i));
            else {
                if (i == str.length() - 1 && str.charAt(i) != str.charAt(i - 1))
                    newString.append(str.charAt(i));
            }
        }
        if (count > 0)
            check(newString.toString());
        else
            System.out.println(newString);
    }


    private static void recursive(String val) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < val.length() - 1; i++) {
            if (val.charAt(i) == val.charAt(i + 1)) {
                int indexOf = stringBuilder.indexOf(val.charAt(i) + "");
                if (stringBuilder.length() >= 1 && indexOf != -1) {
                    stringBuilder.deleteCharAt(indexOf);
                } else {
                    stringBuilder.append(val.charAt(i));
                }
            } else {
                stringBuilder.append(val.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
