package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m1 = Integer.parseInt(scanner.nextLine());
        int m2 = Integer.parseInt(scanner.nextLine());
        int b5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= m1; i++) {
            for (int j = 0; j <= m2; j++) {
                for (int k = 0; k <= b5; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }

            }

        }


    }
}
