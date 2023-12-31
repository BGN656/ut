package lessen6;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    public int masse;
    public double rost;


    public  Person(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = sc.nextLine();
        System.out.println("Возраст ");
        int age = sc.nextInt();
        System.out.println("Вес ");
        int masse = sc.nextInt();
        System.out.println("Рост ");
        double rost = sc.nextDouble();
        dataSt(name, age, masse, rost);
    }
    public void dataSt(String name, int age, int masse, double rost){
        this.age = age;
        this.name =  name;
        this.masse = masse;
        this.rost = rost;
    }

    public void dispInfo() {
        System.out.println("Меня зовут "+ name + " !" + "  Мне "+ age);
    }

    public void  dispInfo2(){
        System.out.println("показвтель" + (rost*100 - masse));
    }



}
