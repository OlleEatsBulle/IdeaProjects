public class bankkonto {
    private String nbr;
    private double balance;

    public void setNbr(String sn){
        nbr = sn;
    }
    public String getNbr(){
        return nbr;
    }
    public void setBalance(double sb){
        balance = sb;
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
}