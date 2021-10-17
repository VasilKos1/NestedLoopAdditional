package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTable = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                if (maxTable == 0) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
                maxTable--;
            }
        }


    }
}
