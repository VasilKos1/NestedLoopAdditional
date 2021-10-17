package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class LuckyNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {       //"щастливи" и различни 4-цифрени числа
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (((i + j) == (k + l)) && (N % (i + j) == 0)) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }  // сбора от първите две цифри е равен на сбора от последните две
                }     // Числото N трябва да се дели без остатък от сбора на първите две цифри на "щастливото" число.
            }
        }

    }
}
