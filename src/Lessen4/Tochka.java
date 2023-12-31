package Lessen4;

import java.util.Scanner;

public class Tochka {
     private double x;
     private double m;
     private double v;
     private double t;

     public Tochka(){
         System.out.println("Создаем");
         Scanner sc = new Scanner(System.in);
         System.out.print("Введите x ");
         double x = sc.nextDouble();
         System.out.print("Ведите  m  ");
         double m = sc.nextDouble();
         System.out.print("Введите  v  ");
         double v = sc.nextDouble();
         System.out.print("Введите  t  ");
         double t = sc.nextDouble();
         setTelo(x, m, v, t);

         System.out.println("Енергия равна  " + energ(m,v));
         System.out.println("Дальность  " + setDl(t, x, v));

     }

     public  double energ(double m, double v)
    {
        this.m = m;
        this.v =v;
        double e = (m*(v*v))/2;
        return e;
    }
    public void setTelo(double x, double m, double v, double t)
    {
       this.x = x;
       this.m = m;
       this.v = v;
       this.t = t;
    }
    public double setDl(double t, double x, double v){
        double y = x + v*t;
        return y;
    }

}
