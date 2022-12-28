package com.dersler;

import com.dersler.multiply.MultiplyMatrix;
import com.dersler.utils.GenerateMatrix;


import java.util.Scanner;

import static com.dersler.multiply.MultiplyMatrix.multiplyMatrix;
import static com.dersler.sum.SumMatrix.sumOfMatris;
import static com.dersler.utils.GenerateMatrix.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Enter Two numbers for Matris!");
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Second number: ");
        int num2 = sc.nextInt();

        /*System.out.println("Fill the first Matris: ");
        int[][] matris1 = generateMatrix(num1,num2);
        printSum(matris1);

        System.out.println("Fill the second Matris: ");
        int[][] matris2 = generateMatrix(num1,num2);

        printSum(matris2);
        int[][] sumMatris = sumOfMatris(matris1,matris2);

        printSum(sumMatris);

        int[][] multiply = multiplyMatrix(matris1,matris2);
        printSum(multiply);*/

        int[][] table = generateBombTable(num1, num2);
        printSum(table);

        int[][] bomb = randomBomb(table);
        System.out.println();
        printSum(bomb);


        while (true) {

            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[0].length; j++) {
                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }


            System.out.print("Enter the row: ");
            int row = sc.nextInt();
            System.out.print("Enter the column: ");
            int column = sc.nextInt();


            if (table[row][column] == 0) {
                System.out.println("Game over!");
                break;
            } else {
                System.out.println("Try again!");
            }

        }


    }
}
