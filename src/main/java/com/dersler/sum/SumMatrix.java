package com.dersler.sum;

public class SumMatrix {

    public static int[][] sumOfMatris(int[][] matris1, int[][] matris2) {
        System.out.println("Sum of Matris: ");
        int row = matris1.length;
        int columns = matris1[0].length;
        int[][] sum = new int[row][columns];
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < columns; k++) {
                sum[i][k] = matris1[i][k] + matris2[i][k];
            }
        }
        return sum;
    }

}
