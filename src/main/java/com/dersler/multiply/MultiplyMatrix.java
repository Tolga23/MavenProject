package com.dersler.multiply;

public class MultiplyMatrix {


    public static int[][] multiplyMatrix(int[][] matris1, int[][] matris2) {
        System.out.println("Multiply of Matris: ");
        int rows1 = matris1.length;
        int columns1 = matris1[0].length;
        int rows2 = matris2.length;
        int columns2 = matris2[0].length;

        if (columns1 != rows2) {
            throw new IllegalArgumentException("The matrices cannot be multiplied.");
        }

        int[][] result = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }
        return result;

    }
}
