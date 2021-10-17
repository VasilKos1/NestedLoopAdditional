package BASIC.Additional_Problems_MIX.NestedLoops;

import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                for (int k = begin; k <= end; k++) {
                    for (int l = begin; l <= end; l++) {
                        if (((i % 2 == 0 && !(l % 2 == 0)) || (!(i % 2 == 0) && (l % 2 == 0))) && (i >= l && ((j + k) % 2 == 0))) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
/*	Ако номерът започва с четна цифра, то той трябва да завършва на нечетна цифра и обратното – ако започва с нечетна,  завършва на четна
             // ((i % 2 == 0 && !(l % 2 == 0)) || (!(i % 2 == 0) && (l % 2 == 0)))
•	Първата цифра от номера е по-голяма от последната
•	Сумата от втората и третата цифра трябва да е четно число*/ //(j + k) % 2 == 0)
                }
            }
        }
    }
}
