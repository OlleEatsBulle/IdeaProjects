public class Konto {
    private String nbr;
    private double balance;
    private Person owner;

    public Konto(String namn){
        nbr = namn;
    }
    public void setNbr(String nb){
        nbr = nb;
    }
    public String getNbr(){
        return nbr;
    }

    public void setBalance(double amount){
        balance = amount;
    }
    public double getBalance(){
        return balance;
    }
    public void credit(double amount){
        balance += amount;

    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public void setOwner(Person p){
        p = owner;

    }
    public Person getOwner(){
        return owner;
    }


}


