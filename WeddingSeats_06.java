package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last = scanner.nextLine().charAt(0);           //•	Последния сектор от секторите - символ (B-Z)
        int rows = Integer.parseInt(scanner.nextLine());   //•	Броят на редовете в първия сектор - цяло число (1-100)
        int seats = Integer.parseInt(scanner.nextLine());  //•	Броят на местата на нечетен ред - цяло число (1-24)

        int count = 0;

        for (int i = 65; i <= last; i++) {
            for (int j = 1; j <= rows; j++) {
                int k = 0;
                if (j % 2 == 0) {      //а на четните редове местата са с 2 повече.
                    k = seats + 2;
                } else {               //Броя на местата на нечетните редове се прочита от конзолата
                    k = seats;
                }
                for (int m = 97; m < 97 + k; m++) { //Местата на нечетен ред са 2 и ще бъдат представени с буквите a и b,
                    //char sector = (char) i;          //а на четен са с 2 повече = 4 - a, b, c, d
                    //char seat = (char) m;
                    System.out.printf("%c%d%c %n", i, j, m);
                    count++;
                }
            }
            rows++;
        }
        System.out.println(count);


    }
}
