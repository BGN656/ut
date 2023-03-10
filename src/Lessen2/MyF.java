package Lessen2;

import java.util.Scanner;

public class MyF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        float dty1 = scan.nextFloat();
        System.out.print("Введите 2 число: ");
        float dty2 = scan.nextFloat();
        System.out.print("Введите математическую операцыю: ");
        String dty = scan.nextLine();
        dty = scan.nextLine();


        System.out.print(dty2 + dty1);
    }
}
