import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Person p = new Person();
        Person b = new Person();
        p.setName("Olle");
        b.setName("Dutt");
        System.out.println(p.getName());
        Konto isk = new Konto("hej");
        Konto ksi = new Konto("hej2");
        p.addAccount(isk);
        p.addAccount(ksi);
        p.addAccount(ksi);
        ksi.setOwner(p);
        isk.setOwner(p);

        ArrayList<Konto> lista = p.getList();
        System.out.println(lista.get(1).getNbr());
        ArrayList<Konto> blista = b.getList();
        Konto bkonto = new Konto("hej");
        b.addAccount(bkonto);
        bkonto.setOwner(b);
        System.out.println(blista.get(0).getNbr());
        blista.get(0).credit(100);
        System.out.println(blista.get(0).getBalance());

        PersonReg pr = new PersonReg();
        Person o = new Person();
        o.setName("Orre");
        o.setpNbr("129763");
        pr.addPerson(o);
        ArrayList<Person> persons = new ArrayList<Person>();
        System.out.println(pr.getList().get(0).getName());
        System.out.println(pr.getList().get(0).getPnbr());
        pr.findPerson("129763");
        pr.removePerson("129763");
    }
}
