import java.util.Scanner;

public class uppg3_25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String bajs;
        System.out.println(" Skriv dit namn: ");
        bajs = scan.nextLine();



        for(int i = 0; i < bajs.length(); i+=2){

           System.out.print(bajs.charAt(i));

        }
    }


}
