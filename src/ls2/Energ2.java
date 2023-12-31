package ls2;

import java.util.Scanner;

import static ls2.EnergP.hp;

public class Energ2 {
    public static double m;
    public static double v;
    public static double e;
    public static double H;

    public static void main(String[] args) {
        m = vvod1();
        v = vvod2();
        e = (m * (v * v)) / 2;
        pr(e);
        H = hp(m, e);
        System.out.println("Высота   " + H);

    }

    static void pr(double e) {
        System.out.println(e);
    }

    static double vvod1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число m  ");
        return m = sc.nextDouble();

    }

    static double vvod2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число v  ");
        return v = sc.nextDouble();
    }

}
