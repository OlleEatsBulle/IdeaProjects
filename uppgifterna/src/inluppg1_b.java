import java.util.Scanner;

import java.text.DecimalFormat;

public class inluppg1_b {
    public static void main(String [] args){
        double lön;
        String lönDecimal;
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        System.out.println("Skriv in ditt namn");
        String namn = s.nextLine();
        System.out.println("Skriv in din timlön:");
        int timlön= s.nextInt();
        System.out.println("Skriv in arbetade timmar:");
        int timmar = s.nextInt();
        lön = (double) timlön * timmar;
        lönDecimal = decimal.format(lön);
        namn = namn.toUpperCase();
        System.out.println(namn+ " , Du har tjänat : " + lönDecimal + "kr " + " denna veckan.");
    }
}
