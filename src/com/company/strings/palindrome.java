package com.company.strings;

public class palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static int isPalindrome(String A) {
        String lowerCase = A.toLowerCase();
        int i = 0;
        int index = A.length() - 1;
        int asciiStart = (int) lowerCase.charAt(i);
        int asciiEnd = (int) lowerCase.charAt(index);

        while (i < A.length() && index > i) {

            if (asciiStart == asciiEnd) {
            }

            if (asciiStart >= 97 && asciiStart <= 122) {
                i++;
                asciiStart = (int) lowerCase.charAt(i);
            }
            if (asciiEnd >= 97 && asciiEnd <= 122) {
                index--;
                asciiEnd = (int) lowerCase.charAt(index);
            }

            if (i == index) {
                return 1;
            }

        }
        return 1;

    }

//    public int isPalindrome(String a) {
//        // check if char at i = char at n - i with two pointers, ignoring non alphanumeric
//        int n = a.length();
//        int startIdx = 0;
//        int endIdx = n - 1;
//
//        while(startIdx < endIdx) {
//            char head = a.charAt(startIdx);
//            head = Character.toLowerCase(head);
//
//            if(!Character.isLetterOrDigit(head)) {
//                // head is not alphanumeric, move on
//                startIdx++;
//            } else {
//                char tail = a.charAt(endIdx);
//                tail = Character.toLowerCase(tail);
//
//                if(!Character.isLetterOrDigit(tail)) {
//                    // tail is not alphanumeric, move on
//                    endIdx--;
//                } else {
//                    // at this point both are alphanumeric, check equality
//                    if(head != tail) {
//                        return 0;
//                    }
//
//                    // chars are equal, move on to next pair
//                    startIdx++;
//                    endIdx--;
//                }
//            }
//        }
//
//        return 1;
//    }
}
