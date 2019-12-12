public class bankkonto_main {
    public static void main(String[] args){
        bankkonto test = new bankkonto();
        test.credit(537.4);
        test.withdraw(320);
        test.setNbr("OlleBulle");
        System.out.println(test.getBalance());
        System.out.println(test.getNbr());
    }
}
