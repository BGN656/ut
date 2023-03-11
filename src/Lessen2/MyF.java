package Lessen2;

import java.util.Scanner;

public class MyF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 число: ");

        float dty1 = scan.nextFloat();
        float dty2 = 1.45f;
        System.out.println(dty2 + dty1);

        int i;
        System.out.print("Введите число 2: ");
        i = scan.nextInt();

        if (i<6) {
            System.out.println("Опа"+ "i = "+ i);
        } else {
            System.out.println("Памммм");
        }

    }
}
