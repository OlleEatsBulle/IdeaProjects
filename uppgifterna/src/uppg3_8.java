import java.util.Scanner;

public class uppg3_8 {

    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ange tal 1: ");
        int tal1 = scanner.nextInt();
        if  (tal1 == 0);
        System.out.println("Tackar!");

        System.out.println (" Ange tal 2: ");
        int tal2 = scanner.nextInt();

        if (tal1 > tal2)
            System.out.println(tal1 + " är större än " + tal2);

        if (tal2 > tal1)
            System.out.println(tal2 + " är större än " + tal1);

        if (tal1 == tal2)
           System.out.println("Talen är lika stora bish");







    }

}
