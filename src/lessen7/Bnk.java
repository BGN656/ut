package lessen7;

public class Bnk {
    private int ty;
    private double tu;
    private String st;

    public Bnk() {
    }

    public Bnk(int ty, double tu, String st) {
        this.ty = ty;
        this.st = st;
        this.tu = tu;
    }

    public static void main(String[] args) {

        Bnk kl = new Bnk(67, 54,"RR");
        System.out.println(kl.st);
        System.out.println(kl.tu);
        System.out.println(kl.ty);
        kl.setTy(2);
        System.out.println(kl.getTy());

        Bnk kl2 = new Bnk();
        System.out.println(kl2.tu);

//
    }

    public void setTy(int ty) {
        this.ty = ty;
    }

    public void setTu(double tu) {
        this.tu = tu;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public int getTy() {
        return ty;
    }

    public double getTu() {
        return tu;
    }

    public String getSt() {
        return st;
    }
}
