package Lessen3.tr3;

import java.util.Scanner;

public class Vistral {

    double x1, x2, y1, y2;

    public static void main(String[] args) {
        Vistral GT = new Vistral();
        System.out.print("число  - ");
        Scanner sc = new Scanner(System.in);

        GT.x1 = sc.nextDouble();
        GT.x2 = sc.nextDouble();
        GT.y1 = sc.nextDouble();
        GT.y2 = sc.nextDouble();
        double ty = tyu(GT.x1, GT.x2, GT.y1, GT.y2);
        System.out.println(ty);

        int s = 5;
        System.out.println(s+4);


    }

  public static double tyu(double x1, double x2, double y1, double y2) {
        return Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)), 0.5);

  }

}



