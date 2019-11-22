import java.util.Arrays;
import java.util.Scanner;

public class uppg3_20 {
    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
        int[] x = new int[5];
       System.out.println( "Skriv in 5 tal: ");
        for( int i = 0; i < 5; i++){
            x[i] = scanner.nextInt();
        }
        int j = 0;
        for( int i = 0; i < 5; i++){
            if( j < x[i]) {
                j = x[i];
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println(j + " är störst");

    }
}
