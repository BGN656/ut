package lessen8;


import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] r1 = new int[]{5, 6, 2, 34, 56};
        ArrayList<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число  ");
            int t = sc.nextInt();
            ls.add(t);

        }
        System.out.println(ls);


    }

}
