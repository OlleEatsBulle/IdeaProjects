import java.util.Arrays;
import java.util.Scanner;

public class inluppg3 {

    public static void main (String[] args) {
    Scanner scanner = new Scanner( System.in );
    int[] Tal = new int [5];
    int i;
    int medeltal = 0;
    int summa = 0;
    int största =0;
    int minsta =0;

    System.out.println(" Skriv in fem tal : ");

        for (i = 0; i < 5; i++) {
        Tal[i] = scanner.nextInt();

    }
         for (i = 0; i < 5; i++) {
        summa += Tal[i];

    }
         for (i = 0; i<5; i++){
        medeltal += Tal[i];
    }

        for (i = 0; i < 5; i++)
        Tal[i] = scanner.nextInt();
        if(Tal[i] < största) {

            System.out.println("Talet"  + största + "är det största talet");
        }

        for (i = 0; i <5; i++)
        Tal[i] = scanner.nextInt();
        if(Tal[i] > minsta) {

            System.out.println("Talet" + minsta + "är det minsta talet");
        }



    System.out.println(Arrays.toString(Tal));




    }
}
