import java.util.Scanner;

public class bankkonto_prog {
    public static void main(String[] args){
        bankkonto bank = new bankkonto();
        char svar = 'N';
        Scanner s = new Scanner(System.in);

        while(svar != 'J'){
            System.out.println("Insättning eller uttag? (0-Insättning, 1- uttag)");
            if(s.nextInt() == 0){
                System.out.println("Ange belopp: ");
                double x = s.nextDouble();
                bank.credit(x);
                System.out.println("Saldo: "+ bank.getBalance());
            }
            else{
                System.out.println("Ange belopp:" );
                double y = s.nextDouble();
                bank.withdraw(y);
                System.out.println("Saldo: "+ bank.getBalance());
            }
            System.out.println("Vill du avsluta? (Om ja skriv J");
            svar = s.next().charAt(0);

        }
      //  System.out.println("Saldo: "+ bank.getBalance());
    }
}

