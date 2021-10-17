package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class TheSongOfWheels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isFound = false;
        String last4 = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i < j && k > l) && (i * j + k * l) == M) {  // a*b + c*d ; a < b ; c > d
                            count++;
                            if (count == 4) {          //	Ако съществува четвърта четворка
                                last4 = String.format("%d%d%d%d", i, j, k, l);
                                isFound = true;
                            }
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
        System.out.println();
        if (isFound) {
            System.out.printf("Password: %s", last4); // Ако съществува четвърта четворка се отпечатва: „Password: {а}{b}{c}{d}“
        } else {
            System.out.println("No!");
        }

    }
}
