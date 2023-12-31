package lessen10;

public class Main {
    public static void main(String[] args) {
        Car2 fo1 = new Car2(1989, "ВОЛГА", 125000);
        Car2 fo2 = new Car2(1967, "МОСКВИЧ", 308000);

        System.out.println(fo1.model);
        System.out.println(fo1.god);
        fo1.rut();
    }
}
