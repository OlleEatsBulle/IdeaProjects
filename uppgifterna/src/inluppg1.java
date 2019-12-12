import java.util.Scanner;

public class inluppg1 {

    public static void main (String[] args){


        Scanner scaner = new Scanner (System.in);
        String x;
        String y;
        System.out.println("Skriv ett ord : ");
        x = scaner.nextLine();
        System.out.println("Skriv ett ord till: ");
        y = scaner.nextLine();
        String z = x +  y ;

        System.out.println( x + " " + y);
        System.out.println(z.length());

    }
}
