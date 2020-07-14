package com.company.gfg.topInterview.array

import java.util.*

object sudoku {
    /**
     * @antony
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val r = Random()
        var firstVal = r.nextInt(8)
        var x = firstVal
        var v = 1
        val a = Array(9) { IntArray(9) }
        val b = Array(9) { IntArray(9) }
        for (i in 0..8) {
            for (j in 0..8) {
                if (x + j + v <= 9) {
                    a[i][j] = j + x + v
                } else {
                    a[i][j] = j + x + v - 9
                }
                if (a[i][j] == 10) a[i][j] = 1
                // System.out.print(a[i][j]+" ");
            }
            x += 3
            if (x >= 9) {
                x -= 9
            }
            // System.out.println();
            if (i == 2) {
                v = 2
                x = firstVal
            }
            if (i == 5) {
                v = 3
                x = firstVal
            }
        }
        val `in` = Scanner(System.`in`)
        println("hey lets play a game of sudoku:take down the question and replace the 0's with your digits and complete the game by re entering your answer")
        println("enter your option 1.hard  2.easy")
        when (`in`.nextInt()) {
            1 -> {
                b[0][0] = a[0][0]
                b[8][8] = a[8][8]
                b[0][3] = a[0][3]
                b[0][4] = a[0][4]
                b[1][2] = a[1][2]
                b[1][3] = a[1][3]
                b[1][6] = a[1][6]
                b[1][7] = a[1][7]
                b[2][0] = a[2][0]
                b[2][4] = a[2][4]
                b[2][8] = a[2][8]
                b[3][2] = a[3][2]
                b[3][8] = a[3][8]
                b[4][2] = a[4][2]
                b[4][3] = a[4][3]
                b[4][5] = a[4][5]
                b[4][6] = a[4][6]
                b[5][0] = a[5][0]
                b[5][6] = a[5][6]
                b[6][0] = a[6][0]
                b[6][4] = a[6][4]
                b[6][8] = a[6][8]
                b[7][1] = a[7][1]
                b[7][2] = a[7][2]
                b[7][5] = a[7][5]
                b[7][6] = a[7][6]
                b[8][4] = a[8][4]
                b[8][5] = a[8][5]
            }
            2 -> {
                b[0][3] = a[0][3]
                b[0][4] = a[0][4]
                b[1][2] = a[1][2]
                b[1][3] = a[1][3]
                b[1][6] = a[1][6]
                b[1][7] = a[1][7]
                b[1][8] = a[1][8]
                b[2][0] = a[2][0]
                b[2][4] = a[2][4]
                b[2][8] = a[2][8]
                b[3][2] = a[3][2]
                b[3][5] = a[3][5]
                b[3][8] = a[3][8]
                b[4][0] = a[4][0]
                b[4][2] = a[4][2]
                b[4][3] = a[4][3]
                b[4][4] = a[4][4]
                b[4][5] = a[4][5]
                b[4][6] = a[4][6]
                b[5][0] = a[5][0]
                b[5][1] = a[5][1]
                b[5][4] = a[5][4]
                b[5][6] = a[5][6]
                b[6][0] = a[6][0]
                b[6][4] = a[6][4]
                b[6][6] = a[6][6]
                b[6][8] = a[6][8]
                b[7][0] = a[7][0]
                b[7][1] = a[7][1]
                b[7][2] = a[7][2]
                b[7][5] = a[7][5]
                b[7][6] = a[7][6]
                b[8][2] = a[8][2]
                b[8][4] = a[8][4]
                b[8][5] = a[8][5]
            }
            else -> println("entered option is incorrect")
        }
        for (y in 0..8) {
            for (z in 0..8) {
                print(b[y][z].toString() + " ")
            }
            println("")
        }
        //            System.out.println("enter your answer");
//            int c[][] = new int[9][9];
//            for (int y = 0; y < 9; y++) {
//                for (int z = 0; z < 9; z++) {
//                    c[y][z] = in.nextInt();
//                }
//            }
//            for (int y = 0; y < 9; y++) {
//                for (int z = 0; z < 9; z++)
//                    System.out.print(c[y][z] + " ");
//                System.out.println();
//            }
//            int q = 0;
//            for (int y = 0; y < 9; y++) {
//                for (int z = 0; z < 9; z++)
//                    if (a[y][z] == c[y][z])
//                        continue;
//                    else {
//                        q++;
//                        break;
//                    }
//            }
//            if (q == 0)
//                System.out.println("the answer you have entered is correct well done");
//            else
//                System.out.println("oh  wrong answer better luck next time");
//            System.out
//                    .println("do you want to play a different game of sudoku(1/0)");
//            p = in.nextInt();
        firstVal = r.nextInt(8)
        /*if (firstval > 8)
                firstval -= 9;*/
//        }
    }
}