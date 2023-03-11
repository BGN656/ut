package Lessen1;

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


    }
}