import java.util.Scanner;

public class inluppg2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ange tal 1: ");
        int tal1 = scanner.nextInt();

        while (tal1 != 0) {

            System.out.println(" Ange tal 2: ");
            int tal2 = scanner.nextInt();

            if (tal1 > tal2)
                System.out.println(tal1 + " är större än " + tal2);

            else if (tal2 > tal1)
                System.out.println(tal2 + " är större än " + tal1);

           else if (tal1 == tal2)
                System.out.println("Talen är lika stora ");
            System.out.println("Ange tal 1: ");
            tal1 = scanner.nextInt();
        }
        System.out.println("Tackar!");



    }
}
