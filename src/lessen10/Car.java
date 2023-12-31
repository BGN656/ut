package lessen10;

public class Car extends BB {
    protected String model;
    protected int probeg;

    {
        System.out.println("Блок динамический класса Сар");
    }

    static {
        System.out.println("Блок два класса Сар");
    }

    protected void rut(){
        System.out.println("Поехали");
    }
}

