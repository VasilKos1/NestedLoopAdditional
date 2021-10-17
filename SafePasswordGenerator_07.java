package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class SafePasswordGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int A = 35;
        int B = 64;
        boolean i = false;

        while (count < max) {

            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    char AC = (char) A;
                    char BC = (char) B;
                    System.out.printf("%c%c%d%d%c%c|", AC, BC, x, y, BC, AC);
                    count++;
                    A++;
                    B++;
                    if (A > 55) {
                        A = 35;
                    }
                    if (B > 96) {
                        B = 64;
                    }
                    if (count == max) {
                        i = true;
                        break;
                    }
                }
                if (i) {
                    break;
                }
                if (x == a) {
                    i = true;
                    break;
                }
            }

            if (i) {
                break;
            }
        }


    }
}
