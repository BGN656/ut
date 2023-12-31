package Lessen5;

import java.util.Scanner;
public class DataCalculation {
   public static final double G = 9.8;
   private double height;
   private double alpha;
   private double speed;

   public DataCalculation(){
      System.out.println("Начало!");
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите высоты (в метрах) ");
      double height = sc.nextDouble();
      System.out.print("Ведите  угол возвышения (в градусах) ");
      double alpha = sc.nextDouble();
      System.out.print("Введите  скорость  (км в час) ");
      double speed1 = sc.nextDouble();
      double speed = (speed1 * 1000)/3600;
      dataStart(height, alpha, speed);
      double speed2 = Math.ceil(speed);
      System.out.print("Высота - " + height + " " + "Угол возвышения - " + alpha + " " + "Скорость - " + speed2 +" м/с");
   }

   public void dataStart(double height, double alpha, double speed){
      this.alpha = alpha;
      this.height = height;
      this.speed = speed;
   }

   public void  maxHeight() {
      double z = ((Math.pow(speed, 2))*(Math.pow(Math.sin(Math.toRadians(alpha)), 2)))/(2*G);
      String rez = String.format("%.2f", z);
      System.out.println();

      System.out.printf("Максимальная высота  %1$s метров. \n", rez);

   }

   public  void maxLengt(){
      double r = Math.toRadians(alpha);
      double s1 = Math.pow((Math.pow(speed, 2) * Math.pow(Math.sin(r), 2) + 2*G*height), 0.5);
      double z = ((Math.pow(speed, 2) * Math.sin(r) * Math.cos(r) + speed * Math.cos(r) * s1))/G;
      String rez = String.format("%.2f", z);
      System.out.printf("Максимальная дальность -  %1$s метров. ", rez);
   }
   public  void  maxTime(){
      double r = Math.toRadians(alpha);
      double t = (2*speed * Math.sin(r))/G;
      String rez = String.format("%.2f", t);
      System.out.printf("Время полета  - %1$s секунд. ", rez);
   }

   public void ura() {
      String gh = "ФФФФФФФ";
      System.out.println(gh);
   }

}
