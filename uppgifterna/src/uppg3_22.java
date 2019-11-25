import java.util.Scanner;

public class uppg3_22 {
    public static void main (String[]args){

        Scanner s = new Scanner(System.in);
        int första;
        int tal = 1;
        System.out.println(" Skriv in ett heltal: ");
        första = s.nextInt();

        if(första == 0){
            System.out.println("Inget tal inläst.");

        }
        while (tal != 0 ) {


            System.out.println(" Skriv in ett heltal: ");
            tal = s.nextInt();
        }

        }
}

