package com.dersler.vezir;

import com.dersler.utils.GenerateMatrix;

import java.util.Scanner;

public class GamePlay {

    public static void playGame(Scanner sc) {
        char[][] matris = GenerateMatrix.generateGameTable(8, 8);
        GenerateMatrix.printGameTable(matris);


        while (true) {
            System.out.print("Enter row: ");
            int row = sc.nextInt();
            System.out.print("Enter column: ");
            int column = sc.nextInt();


            if (matris[row][column] != '1') {
                for (int i = 0; i < matris.length; i++) {
                    matris[row][i] = '1';
                    for (int j = 0; j < matris[0].length; j++) {
                        matris[j][column] = '1';
                    }
                }

                // sol üst capraz
                for (int a = row, b = column; a >= 0 && b >= 0; a--, b--) {
                    matris[a][b] = '1';
                }

                // sağ alt çapraz
                for (int i = row, j = column; i < matris.length && j < matris[0].length; i++, j++) {
                    matris[i][j] = '1';
                }

                // sol alt çapraz
                for (int i = row, j = column; i < matris.length && j >= 0; i++, j--) {
                    matris[i][j] = '1';
                }
                // sağ üst çapraz
                for (int i = row, j = column; i >= 0 && j < matris[0].length; i--, j++) {
                    matris[i][j] = '1';
                }
            } else if (matris[row][column] == '1') {
                System.out.println("Game Over!");
                GenerateMatrix.printGameTable(matris);
                return;
            }

            matris[row][column] = 'V';
            GenerateMatrix.printGameTable(matris);

        }
    }


}
