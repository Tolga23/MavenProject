package com.dersler.utils;

import java.util.Random;

public class GenerateMatrix {
    public static int[][] generateMatrix(int number1, int number2) {
        Random rnd = new Random();
        int[][] matris = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int k = 0; k < number2; k++) {
                matris[i][k] = rnd.nextInt(10);
            }
        }

        return matris;
    }

    public static void printSum(int[][] sum) {

        int row = sum.length;
        int column = sum[0].length;

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                System.out.print(sum[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] generateGameTable(int number1, int number2) {

        char[][] matris = new char[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int k = 0; k < number2; k++) {
                matris[i][k] = '*';
            }
        }

        return matris;
    }

    public static int[][] generateBombTable(int number1, int number2) {

        int[][] matris = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int k = 0; k < number2; k++) {
                matris[i][k] = 1;
            }
        }

        return matris;
    }

    public static char[][] printGameTable(char[][] matris) {
        int row = matris.length;
        int column = matris[0].length;


        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                System.out.print(matris[i][k] + " ");
            }
            System.out.println();
        }

        return matris;
    }

    public static int[][] randomBomb(int[][] matris) {

        int bommNumber = 3;

        Random rnd = new Random();

        while (bommNumber > 0) {
            int x = rnd.nextInt(5);
            int y = rnd.nextInt(5);

            matris[x][y] = 0;
            bommNumber--;
        }

        return matris;
    }

}
