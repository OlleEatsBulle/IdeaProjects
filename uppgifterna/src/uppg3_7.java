import java.util.Scanner;

public class uppg3_7 {
    public static void main (String[]args) {
        int alder;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Skriv in din ålder:  ");
        alder = scanner.nextInt();
        if (alder < 65)
            System.out.println ("Du går i pension om " + (65  - alder) + " år");
        if (alder > 65)
            System.out.println ("Du har varit pensionär i " + (alder - 65) + " år");
        if (alder == 65)
            System.out.println ("Grattis du blev pensionär i år");



    }


}
