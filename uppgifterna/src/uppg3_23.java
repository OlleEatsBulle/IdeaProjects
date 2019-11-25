import java.util.Scanner;

public class uppg3_23 {
    public static void main (String[]args) {

        Scanner scan = new Scanner (System.in);
        String bajs;
        System.out.println(" Skriv ett ord bish: ");
        bajs = scan.nextLine();


        bajs = bajs.toLowerCase();
        int antal = 0;
        char a = 'a';
        for(int i = 0; i < bajs.length(); i++ ){
            if(bajs.charAt(i) == a ) {
              antal ++;
            }
        }                 System.out.println("bokstaven a förekommer " + antal + " gånger");



    }
}
