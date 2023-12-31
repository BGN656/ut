package Lessen3.tr3;

import java.util.Arrays;

public class far {
    public static void main(String[] args) {
        int[] mas  = new int[12];
        int[] mas2 = {2, 4, 7, 34};
        System.out.println(mas2[1]);
        String[] mik = new String[6];
        mas2 = new int[]{3, 6, 56, 78, 5};

        System.out.println(mas[2]);
        System.out.println(mas2[1]);
        System.out.println(mik[2]);
        System.out.println("размер массива  " + mas2.length);
        System.out.println(Arrays.toString(mas2));
        Arrays.sort(mas2);
        System.out.println(Arrays.toString(mas2));

    }
}
