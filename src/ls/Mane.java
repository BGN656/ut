package ls;

public class Mane {

    public static void main(String[] args) {

        String st = "Привіт ";
        String st2 = "учасник";
        String st3 = "придурок";
        st = st.concat(st2);
//        System.out.println(st);
        String st4 = String.join(" ", st, st3);
        System.out.println(st4);
        int[] sd = new int[10];
        System.out.println(sd);
/**
 * прикольно
 */
        String st5 = st4.substring(0, 8);
        System.out.println(st5);
        char ch = st.charAt(3);
//        System.out.println(ch);
        int start = 1;
        int stop = 6;
        char[] df = new char[stop -  start];
        st4.getChars(start, stop, df, 0);
//        System.out.println(df);


    }
}
