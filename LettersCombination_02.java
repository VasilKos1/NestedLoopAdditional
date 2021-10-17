package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class LettersCombination_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextLine().charAt(0);          //за начало на интервала – от ‘a’ до ‚z’.
        int a2 = scan.nextLine().charAt(0);          //за край на интервала  – от първата буква до ‚z’.
        int a3toMiss = scan.nextLine().charAt(0);    //от ‘a’ до ‚z’ – като комбинациите съдържащи тази буквата се пропускат.

        int count = 0;
        for (int i = a1; i <= a2; i++) {
            for (int j = a1; j <= a2; j++) {
                for (int k = a1; k <= a2; k++) {
                    if (!(i == a3toMiss) && !(j == a3toMiss) && !(k == a3toMiss)) {
                        System.out.printf("%c%c%c ", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
        // Да се отпечатат на един ред всички комбинации отговарящи на условието плюс броят им разделени с интервал.


    }
}
