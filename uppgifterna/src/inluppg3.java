
import java.util.Scanner;

public class inluppg3 {

    public static void main(String[] args) {
        int stor;
        int num = 0;
        Scanner s = new Scanner(System.in);
        int length = 5;
        int[] a = new int[5];
        System.out.println("Skriv in fem tal: ");
        for (int i = 0; i < length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < length; i++) {
            num += a[i];

        }
        System.out.println("Summan av talen är: " + num);
        num = 0;
        for (int i = 0; i < length; i++) {
            num += a[i];
        }
        System.out.println("Medeltalet är: " + num / 5);


        stor = a[0];
        for (int i = 1; i < length; i++) {
            if (stor < a[i]) {
                stor = a[i];
            }
        }
        System.out.println("Det största talet är: " + stor);
    }
}