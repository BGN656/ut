package Lessen1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        //      System.out.print("World! \n");
//        System.out.println(10 + 3);
        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите возраст: ");

//        int fid = scan.nextInt();
//        System.out.println("Введите имя: ");
//        String nm = scan.nextLine();
//        nm = scan.nextLine();
//        System.out.print("Привет  " + fid + "  !!!!!  " + nm);

        System.out.print("Введите угол: ");
        double gr = scan.nextFloat();
        double rd = Math.toRadians(gr);
        System.out.println("Синус угла " + gr + " равен " + rd);

        String str = "УРААА";
        System.out.println(str);
        System.out.println(str.length());

        String str2;
        str2 = "tr" + 45;
        System.out.println(str2);


        int dl = str2.length();
        System.out.println("Длина:  " + dl);
        String str3 = str2.toUpperCase(Locale.ROOT);
        System.out.println(str3);

        System.out.print("Введите два числа: ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.println(a + b + c + d);

        int f = 5;
        int f2 =2;

        System.out.println(5%2);

        double x=9/2;
        System.out.println(x);
        double y=17/5;
        System.out.println(y);
        System.out.println(x%y);



    }
}