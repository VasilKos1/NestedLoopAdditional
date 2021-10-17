package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class UniquePINcodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFirst = Integer.parseInt(scanner.nextLine());
        int maxSecond = Integer.parseInt(scanner.nextLine());
        int maxThird = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxFirst; i++) {             //	Първата и третата цифра трябва да бъдат четни
            for (int j = 2; j <= maxSecond; j++) {        //	Втората цифра трябва да бъде просто число в диапазона [2...7].
                for (int k = 1; k <= maxThird; k++) {
                    if ((i % 2 == 0 && k % 2 == 0) && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }

            }

        }
    }
}
