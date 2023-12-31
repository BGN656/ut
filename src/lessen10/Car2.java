package lessen10;

public class Car2 extends Car{
    static {
        System.out.println("Блок один");
    }
    public Car2(int god, String model, int probeg){
        this.god = god;
        this.model = model;
        this.probeg = probeg;
    }
    {
        System.out.println("Блок динамический");
    }

    public int god;
}
