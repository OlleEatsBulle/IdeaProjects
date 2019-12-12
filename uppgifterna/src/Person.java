import java.util.ArrayList;

public class Person {
    private String pNbr;
    private String name;

    ArrayList<Konto> konton = new ArrayList<Konto>();


    public void setpNbr(String pn){
        pNbr = pn;
    }
    public String getPnbr(){
        return pNbr;
    }
    public void setName(String na){
        name = na;
    }
    public String getName(){
        return name;
    }
    public void addAccount(Konto namn){
        Konto tmp;
        tmp = namn;
        konton.add(tmp);

    }
    public ArrayList<Konto> getList(){
        return konton;
    }
    public void setList(ArrayList<Konto> newLista){
        konton = newLista;
    }
}
