package Lessen3;

import java.util.Scanner;

public class Calk {
    public static void main(String[] args) {
        System.out.print("Введите число:  ");
        double x = xx();
        System.out.print("Введите число:  ");
        double y = xx();
        double z = sum(x, y);
        System.out.printf("Сумма равна: %1$f ", z);

    }

    static double sum(double x, double y) {
        return x + y;
    }

    static double xx() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.print("УУУУ");
            return 0;
        }
    }

}


